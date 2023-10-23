public class Krug extends Elipsa{
    //Napisati klasu Krug koja nasledjuje klasu Elipsa
    //Ova klasa nema ni jedan atribut
    //
    //Napisati 2 konstruktora:
    //- Jedan konstruktor koji prima double r i poziva odgovarajuci konstruktor natklase
    //- Jedan podrazumevani konstruktor
    //
    //Napisati sve gettere i settere
    //
    //Napisati metodu obim koja vraca obim kruga
    //
    //Overridovati toString() metod tako da vraca nisku oblika:
    //"Elipsa poluprecnika <r> ima
    // Obim: <obim>
    // Povrsinu: <povrsina>
    // Ekscentritet: <eskcentritet>"


    public Krug(double r) {
        super(r, r);
    }

    public Krug() {
    }

    public double getA() {
        return super.getA();

    }

    public void setR(double r) {
        super.setA(r);
        super.setB(r);
    }

    public double obim(){
        return 2*Math.PI*getA();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Krug poluprecnika ").append(getA()).append(" ima").append("\n");
        sb.append("Povrsinu: ").append(povrsina()).append("\n");
        sb.append("Obim: ").append(obim());
        return sb.toString();
    }
}
