public class Voznja {
    //Napisati klasu Voznja iz koje ce program moci da se pokrene.
    // U njoj ce se kreirati najmanje dva automobila.
    // Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
    public static void main(String[] args) {
        Automobil automobil = new Automobil("audi", "A1", 555, new Vlasnik("Pera"));
        Automobil automobil1 = new Automobil("fiat", "punto", 666);

        System.out.println(automobil);
        System.out.println("===========");
        System.out.println(automobil1);
        System.out.println("===========");
        System.out.println(automobil1.getMarka());
        automobil.vlasnik.setIme("Mile");
        System.out.println("===========");
        System.out.println(automobil);


    }
}
