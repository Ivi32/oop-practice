public class Pravougaonik extends Geometrija2D{
    private double a, b;

    public Pravougaonik(double a, double b) {
        super ("Pravougaonik");
        this.a = a;
        this.b = b;
    }

    public double getA() {return a;}

    public double getB() {return b;}

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public  double povrsina() {
        return a * b;
    }

    @Override
    public  double obim() {
        return 2*a + 2*b;
    }

    private String formatirajStranice() {
        if (a != b)
            return "Stranice: " + a + " " + b;
        return "Stranica: " + a;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append("\n");
        sb.append(formatirajStranice()).append("\n");
        sb.append("Obim = ").append(obim()).append("\n");
        sb.append("Porvsina = ").append(povrsina());

        return sb.toString();
    }
}
