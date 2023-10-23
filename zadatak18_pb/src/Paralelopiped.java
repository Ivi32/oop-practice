public abstract class Paralelopiped extends Figura{
    //Napisati abstraktnu klasu Paralelogram koja nasledjuje klasu Figura i ima atribute:
    //- double a
    //- double b
    //
    //Napisati konstruktor koji prima sve argumente pazeci da stranice moraju biti pozitivni brojevi
    //
    //Napisati sve gettere i settere
    //
    //Overridovati metod:
    //1. obim()
    private double a;
    private double b;

    public Paralelopiped(double a, double b) {
        if(a > 0)
            this.a = a;
        if( b>0)
            this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double obim() {
        return 0;
    }
}
