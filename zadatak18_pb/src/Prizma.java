public class Prizma extends Paralelopiped{
    //Napisati klasu Prizma koja nasledjuje Paralelopiped i nema atribute
    //
    //OVerridovati metode:
    //1. povrsina()
    //2. zapremina()
    //3. getIme() - vraca nisku "Prizma"

    public Prizma(double a, double b) {
        super(a, b);
    }

    @Override
    public String getIme() {
        return "Prizma";
    }

    @Override
    public double zapremina() {
        return getA()*getA()*getB();
    }

    @Override
    public double povrsina() {
        return getA()*getB()*Math.sqrt(2);
    }
}
