public class Krug extends  Elipsa{

    private double r;

    public Krug(double r) {
        super(r, r);
        this.r = r;
        setIme("Krug");
    }

    //getteri i setteri

    @Override
    public  double obim() {
        return 2*r*Math.PI;
    }
}
