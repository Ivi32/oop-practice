import java.util.List;

public class Kafic extends UgostiteljskiObjekat{
    //Napisati klasu Kafic koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
    //- double zarada; //Ukupna zarada kafica
    private double zarada;
    private int brojProdatihKafa;
    //Za svaki nadkonstruktor napisati jedan konstruktor koji postavlja ukupnu zaradu na 0.0

    public Kafic(String naziv, List<Radnik> radnici, double zarada) {
        super(naziv, radnici);
        this.zarada = 0;
    }

    public Kafic(String naziv, double zarada) {
        super(naziv);
        this.zarada = 0;
    }

    public Kafic(List<Radnik> radnici, double zarada) {
        super(radnici);
        this.zarada = 0;
    }

    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

    public double getZarada() {
        return zarada;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    //Implementovati sve metode na sledeci nacin:
    //- public void usluzi(Osoba o)
    // Prodaje kafu osobi.
    // Cena kafe iznosi 20 * <k>,
    // gde je k zbir duzine karaktera u imenu i prezimenu osobe kojoj se prodaje kafa

    @Override
    public void usluzi(Osoba o) {
        zarada += 20*(o.getIme().length() + o.getPrezime().length());
        brojProdatihKafa++;
    }

    //- public void usluziSve(List<Osoba> o)
    // Prodaje kafu svim osobama iz liste na isti nacin kao gore definisan

    @Override
    public void usluziSve(List<Osoba> osobe) {
        for (Osoba o:osobe) {
            usluzi(o);
        }
    }

    //- public void usluziSve(Osoba ... o)
    // Prodaje kafu svim prosledjenim osoba na isti nacin kao gore definisan.

    @Override
    public void usluziSve(Osoba... osobe) {
        for (int i = 0; i < osobe.length; i++) {
            usluzi(osobe[i]);
        }
    }


    //- public double bruto()
    // Vraca bruto zaradu Kafica. Bruto zarada se racuna kao zbir svih kafa prodatih do tog momenta.

    @Override
    public double bruto() {
        return zarada;
    }


    //- public double neto()
    // Vraca neto zaradu Kafica. Neto zarada se racuna kada se od bruto zarade oduzme porez od 1_000.

    @Override
    public double neto() {
        return bruto()-1000;
    }


    //Serilizovati klasu na sledeci nacin:
    //"Kafic: <naziv>
    // Do sada prodato: <brojKafaProdatih>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kafic").append(" ").append(getNaziv()).append("\n");
        sb.append("Do sada prodato: ").append(brojProdatihKafa);
        return sb.toString();
    }
}
