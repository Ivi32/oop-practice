public class Test {
    //Napisati glavni program koji kreira tri igraca.
    // U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
    public static void main(String[] args) {
        Sportista sportista = new Sportista("Pera Peric", "kosarka", "partizan", 55);
        Sportista sportista1 = new Sportista("Janko Jankovic", "odbojka", "Vojvodina", 77);
        Sportista sportista2 = new Sportista("Novak Djokovic", "tenis", "Srbija", 1);

        System.out.println(sportista);
        System.out.println("==========");
        System.out.println(sportista1);
        System.out.println("==========");
        System.out.println(sportista2);
        System.out.println("===========");
        sportista.setKlub("buducnost");
        System.out.println(sportista);
    }
}
