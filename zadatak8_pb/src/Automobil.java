public class Automobil {
    private String marka;
    private int godinaProizvodnje;
    private double kilometraza;

    public Automobil(String marka, int godinaProizvodnje, double kilometraza) {
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
    }

    public Automobil() {
    }

    public String getMarka() {
        return marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(marka).append(", ").append(godinaProizvodnje).append(", ").append(kilometraza);
        return sb.toString();
    }
}
