public class Krava extends DomacaZivotinja{

    //Napisati klase Krava, Ovca, Pas, Macka, Konj, Kokoska koje nemaju atribute.
    //
    //Napisati sve odgovarajuce konstruktore
    //
    //Napisati sve gettre i settere
    //
    //Overridovati sve metode.


    public Krava(String naziv, double kilaza, int brojNogu, String ime) {
        super(naziv, kilaza, brojNogu, ime);
    }

    public Krava(double kilaza, int brojNogu, String ime) {
        super(kilaza, brojNogu, ime);
    }

    @Override
    public void setNaziv(String naziv) {
        super.setNaziv("krava");
    }


    @Override
    public void leti() {
        System.out.println("ne letim");
    }

    @Override
    public void pliva() {
        System.out.println("ne plivam");
    }

    @Override
    public int brojNogu() {
        return 4;
    }

    @Override
    public void oglasiSe() {
        System.out.println("muuuuu");
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }
}
