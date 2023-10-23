import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Automobil v1 = new Automobil("aa", "audi", "a1", 3);
        System.out.println(v1);
        v1.dodajPutnika(5);
        System.out.println(v1);
        Autobus v2 = new Autobus("bb", "mercedes", "neki stari", 55);
        System.out.println(v2);
        v2.oduzmiPutnika(66);
        System.out.println(v2);
        Kamion v3 =
                new Kamion("cc", "lada", "niva", 1,new ArrayList<>(List.of("kupus", "boranija")));
        System.out.println(v3);
        v3.oduzmiPutnika();
        System.out.println(v3);
        v3.dodajPutnika(5);
        System.out.println(v3);

    }
}
