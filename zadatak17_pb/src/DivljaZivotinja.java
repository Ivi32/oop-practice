public abstract class DivljaZivotinja extends Zivotinja{
    //Napisati abstraktnu klasu DivljaZivotinja koja nasledjuje klasu Zivotnja i ima atribute:
    //- int brojNogu
    //- String staniste
    //
    //Napisati sve odgovarajuce konstruktore
    //
    //Napisati sve gettre i settere
    //
    //Napisati abstraktne metode:
    //1. boolean daLiSamOpasna() - koja vraca odgovor na pitanje da li je takva zivotnija opasna po coveka
    //
    //Overridovati sve moguce metode

    private int brojNogu;
    private String staniste;

    public DivljaZivotinja(String naziv, int brojNogu, String staniste) {
        super(naziv);
        this.brojNogu = brojNogu;
        this.staniste = staniste;
    }

    public DivljaZivotinja(int brojNogu, String staniste) {
        this.brojNogu = brojNogu;
        this.staniste = staniste;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }

    public abstract boolean daLiSamOpasna();

    @Override
    public boolean daLiJeDomaca() {
        return false;
    }
}
