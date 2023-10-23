public class Test {
    public static void main(String[] args) {
        Osoba autor = new Osoba("Irena", "Brajkovic", 36);
        Osoba vlasnik = new Osoba("Mladen", "Kiso",36);
        Knjiga knjiga = new Knjiga("Moj tuzan zivot",new Osoba("Irena", "Brajkovic", 36),new Osoba("Mladen", "Kiso",36) ,100, 2023);
        System.out.println(knjiga);
        System.out.println("=============");
        Knjiga knjiga1 = new Knjiga("Boze pomozi", null, new Osoba("Pera", "Peric", 66),200, 2021);
        System.out.println(knjiga1);
        System.out.println("===========");
        knjiga1.setBrojStrana(-50);

    }
}
