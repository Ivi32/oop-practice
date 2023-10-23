public class Lav extends DivljaZivotinja{

    public Lav(String naziv, int brojNogu, String staniste) {
        super(naziv, brojNogu, staniste);
    }

    public Lav(int brojNogu, String staniste) {
        super(brojNogu, staniste);
    }

    @Override
    public void setNaziv(String naziv) {
        super.setNaziv("lav");
    }

    @Override
    public boolean daLiSamOpasna() {
        return true;
    }

    @Override
    public void leti() {
        System.out.println("ne mogu da letim");
    }

    @Override
    public void pliva() {
        System.out.println(("mogu da plivam"));
    }

    @Override
    public int brojNogu() {
        return 4;
    }

    @Override
    public void oglasiSe() {
        System.out.println("roar");
    }
}
