public class Kvadrat extends Pravougaonik{
    private double a;

    public Kvadrat(double a) {
        super(a, a);
        setIme("Kvadrat");
        this.a = a;
    }

    public double getA() {return a;}

    public void setA(double a) {
        this.a = a;
    }

    // Ne trebaju mi implementacije obim() i povrsina()

}
