import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Namirnica namirnica = new Namirnica("jabuka", 15);
        Namirnica namirnica1 = new Namirnica("kruska", 10);
        Namirnica namirnica1a = new Namirnica("kruska", 10);
        Namirnica namirnica2 = new Namirnica("banana", 55);
        Namirnica namirnica3 = new Namirnica("lubenica", 6);
        Namirnica namirnica4 = new Namirnica("breskva", 88);

        ArrayList<Namirnica> namirniceUProdavnici = new ArrayList<>();
        namirniceUProdavnici.add(namirnica2);
        namirniceUProdavnici.add(namirnica1);

        Prodavnica prodavnica = new Prodavnica("Maxi",namirniceUProdavnici );
        System.out.println(prodavnica);
        prodavnica.dodajNamirnicu(namirnica);
        System.out.println(prodavnica);
        prodavnica.ukloniNamirnicu(namirnica1a);
        System.out.println(prodavnica);
        prodavnica.ukloniNamirnicu(namirnica1);
        System.out.println(prodavnica);

        Osoba osoba = new Osoba("Irena", "Kiso", 36);
        System.out.println("-------------------------");
        System.out.println(osoba);

        Korpa korpa = new Korpa();
        korpa.dodajUKorpu(namirnica);
        korpa.dodajUKorpu(namirnica1);
        korpa.dodajUKorpu(namirnica1);
        korpa.dodajUKorpu(namirnica1);
        korpa.dodajUKorpu(namirnica2);
        korpa.dodajUKorpu(namirnica3,2);
        System.out.println("-------------------------");
        System.out.println(korpa);

        //korpa.ukloniIzKorpe(namirnica1);
        //korpa.ukloniIzKorpe(namirnica1);
        korpa.ukloniIzKorpe(namirnica1, 4);
        System.out.println("-------------------------");
        System.out.println(korpa);
        //System.out.println("-------------------------");
        //korpa.isprazniKorpu();
        //System.out.println(korpa);

        Kupac novi = new Kupac("Mladen", "Kiso", 36, 1000);
        novi.dodajUKorpu(namirnica3, 3);
        System.out.println(novi);

    }
}
