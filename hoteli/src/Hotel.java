import java.util.ArrayList;
import java.util.List;

public class Hotel extends UgostiteljskiObjekat{
    //Napisati klasu Hotel koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
    //- final int brojSoba;
    // Oznacava koliko ukupno raspolozivih soba ima u hotelu.
    // Pretpostaviti da su sve jednokrevetne (za jednu osobu)
    //- double cenaSobe;
    // Cena za iznajmljivanje sobe. Pretpostaviti da sve sobe kostaju isto
    //- double zarada; //Ukupna zarada hotela
    //- List<Osoba> gosti;
    private final int brojSoba;
    private double cenaSobe;
    private double zarada;
    private List<Osoba> gosti;
    //Za svaki nadkonstruktor napisati jedan konstruktor
    // koji prima broj soba sa kojima raspolaze i cenu za iznajmljivanje sobe,
    // goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0

    public Hotel(String naziv, List<Radnik> radnici, int brojSoba, double cenaSobe) {
        super(naziv, radnici);
        this.brojSoba = brojSoba;
        this.cenaSobe = cenaSobe;
        this.gosti = new ArrayList<>();
        this.zarada = 0;
    }

    public Hotel(String naziv, int brojSoba, double cenaSobe) {
        super(naziv);
        this.brojSoba = brojSoba;
        this.cenaSobe = cenaSobe;
        this.gosti = new ArrayList<>();
        this.zarada = 0;
    }

    public Hotel(List<Radnik> radnici, int brojSoba, double cenaSobe) {
        super(radnici);
        this.brojSoba = brojSoba;
        this.cenaSobe = cenaSobe;
        this.gosti = new ArrayList<>();
        this.zarada = 0;
    }


    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

    public int getBrojSoba() {
        return brojSoba;
    }

    public double getCenaSobe() {
        return cenaSobe;
    }

    public double getZarada() {
        return zarada;
    }

    public List<Osoba> getGosti() {
        return gosti;
    }

    public void setCenaSobe(double cenaSobe) {
        this.cenaSobe = cenaSobe;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    public void setGosti(List<Osoba> gosti) {
        this.gosti = gosti;
    }

    //Implementovati sve metode na sledeci nacin:
    //- public void usluzi(Osoba o) //Ubacuje osobu o u listu gostiju ako je to moguce.

    @Override
    public void usluzi(Osoba o) {
        if (gosti.size() < brojSoba) {
            gosti.add(o);
            zarada += cenaSobe;
        }
    }
    //- public void usluziSve(List<Osoba> o)
    // Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce.
    // Ako nije moguce ubaciti SVE osobe iz prosledjene liste, ne ubacuje NI JEDNU osobu iz prosledjene liste

    @Override
    public void usluziSve(List<Osoba> osobe) {
        if (osobe.size() <= (brojSoba - gosti.size())) {
            gosti.addAll(osobe);
            zarada += cenaSobe* osobe.size();
        }
    }
    //- public void usluziSve(Osoba ... o) // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.

    @Override
    public void usluziSve(Osoba... osobe) {
        while(brojSoba > gosti.size()){
            for (int i = 0; i < osobe.length; i++) {
                usluzi(osobe[i]);
            }
        }
    }

    //- public double bruto()
    // Vraca bruto zaradu Hotela.
    // Bruto zarada se racuna kao zbir cena svih soba koje su iznajmljene do tog momenta.

    @Override
    public double bruto() {
        return zarada;
        // return gosti.size()*cenaSobe;
    }

    //- public double neto()
    // Vraca neto zaradu Hotela.
    // Neto zarada se racuna kada se od bruto zarade oduzme
    // sve sto hotel treba da plati svojim zaposlenima (kada isplati plate svojim zaposlenima)
    // i kada se oduzme porez od 10_000

    @Override
    public double neto() {
        return bruto() - 10000 - ukupnaPlata();
    }

    //Napisati metode:
    //- public void odjaviOsobu(Osoba o)
    // Izbacuje osobu o iz liste gostiju i oslobadja njegovu sobu ako je to moguce.
    // (Moguce je proslediti i duboku kopiju osobe koja je smestena u hotelu ili osobu koja uopste nije gost hotela)

    public void odjaviOsobu(Osoba o){
        for (Osoba osoba:gosti) {
            if(osoba.jednaki(o))
                gosti.remove(osoba);
            return;
        }
    }

    //Serilizovati klasu na sledeci nacin:
    //"Hotel: <naziv>
    // Broj slobodnih soba: <brojSlobodnihSoba>
    // Cena sobe: <cenaSobe>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel: ").append(this.getNaziv()).append("\n");
        sb.append("Broj slobodnih soba: ").append(brojSoba - gosti.size()).append("\n");
        sb.append("Cena sobe: ").append(cenaSobe);
        return sb.toString();
    }
}
