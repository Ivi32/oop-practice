public class Radnik extends Osoba{
    //Napisati klasu Radnik koja prosiruje klasu Osoba i ima atribute:
    //- int id
    //- double plata
    private int id;
    private double plata;

    //Zagarantovati da svaki Radnik ima svoj jedinstveni id broj!
    private static int ID;
    //Napisati za svaki nadkonstrukor jedan konstruktor koji prima double platu.
    // Uzeti da je podrazumevana plata 0.0

    public Radnik(String ime, String prezime, int brojGodina, double plata) {
        super(ime, prezime, brojGodina);
        this.id = ID;
        ID++;
        this.plata = plata;
    }

    public Radnik(double plata) {
        this.id = ID;
        ID++;
        this.plata = plata;
    }

    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

    public int getId() {
        return id;
    }

    public double getPlata() {
        return plata;
    }

    public static int getID() {
        return ID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public static void setID(int ID) {
        Radnik.ID = ID;
    }

    //Ovveridovati metode:
    //- public boolean jednaki(Osoba o)
    // Vraca true ako je prosledjena osoba ista kao ovaj (this) radnik.
    // Ovaj radnik je isti kao Osoba o ako je o instanca klase Radnik i ako imaju isti id.

    @Override
    public boolean jednaki(Osoba o) {
        if( o instanceof Radnik && ((Radnik) o).getId() == this.id)
            return true;
        else
            return false;
    }

    //Serilizovati klasu na sledeci nacin:
    //"<ime> <prezime> (<brojGodina>) [<id>]"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ").append("[").append(id).append("]");
        return sb.toString();
    }

}
