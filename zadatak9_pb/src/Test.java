import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Ucenik u1 = new Ucenik("Irena", "Brajkovic");
        ArrayList<Integer> oceneu1 = new ArrayList<>();
        oceneu1.add(2);
        oceneu1.add(5);
        oceneu1.add(3);
        u1.setOcene(oceneu1);
        System.out.println(u1);
        System.out.println(u1.prosek());

        Ucenik u2 = new Ucenik("Mladen", "Kiso", new ArrayList<>(List.of(5, 3, 4)));
        Ucenik u3 = new Ucenik("Ema", "Brajkovic", new ArrayList<>(List.of(5, 5, 4)));

        Odeljenje o1 = new Odeljenje("prvo", new ArrayList<>(List.of(u1, u2, u3)));
        System.out.println(o1);
        System.out.println("============");

        System.out.println(o1.velicinaOdeljenja());
        System.out.println("============");
        System.out.println(o1.izlistajDnevnik());
        System.out.println("============");
        System.out.println(o1.prosecnaOcenaOdeljenja());
        System.out.println("============");
        o1.opisnaOcena(u3);
        System.out.println("============");
        o1.prosecnaOcena(u2);
        o1.prosecnaOcena(1);

        System.out.println("============");
        o1.ispisiUcenika(u2);
        System.out.println(o1);
        o1.upisiUcenika(u2);
        System.out.println(o1);
        o1.ispisiUcenika(0);
        System.out.println(o1);

    }
}
