public class Kocka extends Prizma{
    //Napisati klasu Kocak koja nasledjuje Prizmu i nema atribute
    //
    //Overridovati metod:
    //1. getIme() - vraca nisku "Kocka"


    public Kocka(double a) {
        super(a, a);
    }

    @Override
    public String getIme() {
        return "Kocka";
    }
}
