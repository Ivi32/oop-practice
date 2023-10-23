public class Elipsa {
    //Napisati klasu Elipsa koja sadrzi atribute:
    //- double a (prva poluosa)
    //- double b (druga poluosa)
    //
    //Napisati 2 konstruktora:
    //- Jedan konstruktor koji prima sve argumente
    //- Podrazumevani konstruktor
    //
    //Napisati sve gettere i settere
    //
    //Omoguciti da se objekti ove klase porede pomocu hashCode() i equals() metoda.
    //
    //Napisati metode:
    //1. povrsina - koja vraca povrsinu elipse
    //2. ekscentritet - koja vraca eskcentritet elipse
    //3. vecaPoluosa - koja vraca duzinu vece poluose
    //4. manjaPoluosa - koja vraca duzinu manje poluose
    //
    //Overridovati toString() metod tako da vraca nisku oblika:
    //"Elipsa vece poluose: <vecaPoluosa> i manje poluose: <manjaPoluosa> ima
    // Povrsinu: <povrsina>
    // Ekscentritet: <eskcentritet>"
    private double a;
    private double b;

    public Elipsa(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Elipsa() {
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

    public double povrsina(){
        return a*b*Math.PI;
    }

    public double ekscentritet(){
        return Math.sqrt(1-b*b/a*a);
    }

    public double vecaPoluosa(){
        return a > b? a : b;
    }

    public double manjaPoluosa(){
        return a < b? a : b;
    }
    //Overridovati toString() metod tako da vraca nisku oblika:
    //    //"Elipsa vece poluose: <vecaPoluosa> i manje poluose: <manjaPoluosa> ima
    //    // Povrsinu: <povrsina>
    //    // Ekscentritet: <eskcentritet>"


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elipsa vece poluose ").append(vecaPoluosa()).append(" i manje poluose ")
                .append(manjaPoluosa()).append(" ima").append("\n");
        sb.append("Povrsinu: ").append(povrsina()).append("\n");
        sb.append("Ekscentritet: ").append(ekscentritet());
        return sb.toString();
    }
}
