public abstract class DomacaZivotinja extends Zivotinja{
    //Napisati abstraktnu klasu DomacaZivotinja koja nasledjuje klasu Zivotinja i ima atribute:
    //- String ime
    //- double kilaza
    //- int brojNogu
    private double kilaza;
    private int brojNogu;

    private String ime;
    //Napisati sve odgovarajuce konstruktore

    public DomacaZivotinja(String naziv, double kilaza, int brojNogu, String ime) {
        super(naziv);
        this.kilaza = kilaza;
        this.brojNogu = brojNogu;
        this.ime = ime;
    }

    public DomacaZivotinja(double kilaza, int brojNogu, String ime) {
        this.kilaza = kilaza;
        this.brojNogu = brojNogu;
        this.ime = ime;
    }

    //Napisati sve gettre i settere

    public double getKilaza() {
        return kilaza;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public String getIme() {
        return ime;
    }

    public void setKilaza(double kilaza) {
        this.kilaza = kilaza;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    //Napisati abstraktne metode:
    //1. boolean daLiSeJedem() - koja vraca na odgovor na pitanje da li se meso te zivotinje jede, ili ne (poput "psa" i "macke")
    public abstract boolean daLiSeJedem();
    //Overridovati sve metode koje mozemo da overridujemo

    @Override
    public boolean daLiJeDomaca(){
        return true;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------
    //
    //Napisati klase Krava, Ovca, Pas, Macka, Konj, Kokoska koje nemaju atribute.
    //
    //Napisati sve odgovarajuce konstruktore
    //
    //Napisati sve gettre i settere
    //
    //Overridovati sve metode.
}
