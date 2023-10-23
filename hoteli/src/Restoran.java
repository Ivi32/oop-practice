import java.util.ArrayList;
import java.util.List;

public class Restoran extends UgostiteljskiObjekat{
    //Napisati klasu Restoran koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
    //- final int brojStolova;
    // Oznacava koliko ukupno raspolozivih stolova ima u restoranu. Pretpostaviti da su svi za jednu osobu
    //- double cenaRucka;
    // Cena rucka. Pretpostaviti da je to jedina stavka na meniju
    //- double zarada;
    // Ukupna zarada restorana
    //- List<Osoba> gosti;

    //Za svaki nadkonstruktor napisati jedan konstruktor koji prima broj stolova sa kojima raspolaze i cenu zrucka, goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0
    //
    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja
    //
    //Implementovati sve metode na sledeci nacin:
    //- public void ugosti(Osoba o) //Ubacuje osobu o u listu gostiju ako je to moguce.
    //- public void ugostiSve(List<Osoba> o) //Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce. Ako nije moguce ubaciti SVE osobe iz prosledjene liste, ne ubacuje NI JEDNU osobu iz prosledjene liste
    //- public void ugostiSve(Osoba ... o) // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.
    //- public double bruto() // Vraca bruto zaradu Restorana. Bruto zarada se racuna kao zbir svih ruckova napravljenih do tog momenta.
    //- public double neto() // Vraca neto zaradu Restorana. Neto zarada se racuna kada se od bruto zarade oduzme sve sto restoran treba da plati svojim zaposlenima (kada isplati plate svojim zaposlenima) i kada se oduzme porez od 1_000
    //
    //Napisati metode:
    //- public void odjaviOsobu(Osoba o) // Izbacuje osobu o iz liste gostiju i oslobadja njegov sto ako je to moguce. (Moguce je proslediti i duboku kopiju osobe koja ruca u restoranu ili osobu koja uopste nije gost restorana)
    //
    //Serilizovati klasu na sledeci nacin:
    //"Restoran: <naziv>
    // Meni: Rucak | <cenaRucka>"

    private final int brojStolova;
    private double cenaRucka;
    private double zarada;
    private List<Osoba> gosti;

    public Restoran(String naziv, List<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(naziv, radnici);
        this.brojStolova = brojStolova;
        this.cenaRucka = cenaRucka;
        //this.zarada = 0;
        this.gosti = new ArrayList<>();
    }

    public Restoran(String naziv, int brojStolova, double cenaRucka) {
        super(naziv);
        this.brojStolova = brojStolova;
        this.cenaRucka = cenaRucka;
        //this.zarada = 0;
        this.gosti = new ArrayList<>();
    }

    public Restoran(List<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(radnici);
        this.brojStolova = brojStolova;
        this.cenaRucka = cenaRucka;
        //this.zarada = 0;
        this.gosti = new ArrayList<>();
    }


    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

    public int getBrojStolova() {
        return brojStolova;
    }

    public double getCenaRucka() {
        return cenaRucka;
    }

    public double getZarada() {
        return zarada;
    }

    public List<Osoba> getGosti() {
        return gosti;
    }

    public void setCenaRucka(double cenaRucka) {
        this.cenaRucka = cenaRucka;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    public void setGosti(List<Osoba> gosti) {
        this.gosti = gosti;
    }


    @Override
    public void usluzi(Osoba o){
        if(gosti.size() < brojStolova) {
            gosti.add(o);
            zarada += cenaRucka;
        }
    }

    @Override
    public void usluziSve(List<Osoba> o) {
        if (o.size() <= (brojStolova - gosti.size())) {
            gosti.addAll(o);
            zarada += cenaRucka*o.size();
        }
    }


    @Override
    public void usluziSve(Osoba... osobe) {
        for (int i = 0; i < osobe.length; i++) {
            if (gosti.size() < brojStolova) {
                usluzi(osobe[i]);
            }
        }
    }

    @Override
    public double bruto(){
        //return gosti.size()*cenaSobe;
        return zarada;
    }

    @Override
    public double neto(){
        /*double ukupnaZaradaSvihZaposlenih = 0;
        for (Radnik r:this.getRadnici()) {
            ukupnaZaradaSvihZaposlenih += r.getPlata();
        }
        return bruto()-10000 -ukupnaZaradaSvihZaposlenih; */

        return bruto()-10000 -ukupnaPlata();
    }

    public void odjaviOsobu(Osoba o){
        for (Osoba osoba:gosti) {
            if(osoba.jednaki(o)){
                gosti.remove(osoba);
                return;
            }
        }
    }

///Serilizovati klasu na sledeci nacin:
//    //"Restoran: <naziv>
//    // Meni: Rucak | <cenaRucka>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Restoran: ").append(this.getNaziv()).append("\n");
        sb.append("Meni: Rucak").append(cenaRucka);
        return sb.toString();
    }
}
