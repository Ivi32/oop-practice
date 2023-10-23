public class Elipsa extends Geometrija2D{
    private double a, b;

    public Elipsa(double a, double b) {
        super("Elipsa");
        if (a < b) {
            //pokusajte da obrnete vrednosti BEZ dodatnih promenjivih
            double t = a;
            a = b;
            b = t;
        }
        this.a = a;
        this.b = b;
    }

    public void setA (double a) {
        this.a = a;
    }

    public void setB (double b) {
        this.b = b;
    }

    public double getA() {return a;}
    public double getB() {return b;}

    //Obim elipse nije analiticki resiv

    @Override
    public double povrsina() {
        return a*b*Math.PI;
    }

    @Override
    public double obim(){
        return 0;
    }

    @Override
    public String toString() {
        return "...";
    }
}
