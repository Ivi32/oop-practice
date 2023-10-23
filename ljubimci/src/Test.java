import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Ljubimac prvi = new Ljubimac("Dzeki", "Pas", 4, false, 17);
        Ljubimac drugi = new Ljubimac("Hani", "Pas", 4, false, 12);
        Ljubimac treci = new Ljubimac("Ivi", "Maca", 4, false,10);
        System.out.println(prvi);
        System.out.println("==============");

        Vlasnik neki = new Vlasnik("Irena", "Kiso", 36,new ArrayList<>(List.of(prvi, drugi)));
        System.out.println(neki);
        System.out.println("=========");
        neki.dodajLjubimca(treci);
        System.out.println(neki);
        neki.oduzmiLjubimca(prvi);
        System.out.println("=========");
        System.out.println(neki);
        System.out.println("===========");

        Odgajivac nekidrugi = new Odgajivac("Pera", "Petrovic", 55,
                new ArrayList<>(List.of(prvi, drugi, treci)), "Pas");
        System.out.println(nekidrugi);
        System.out.println("============");
        System.out.println(nekidrugi.vratiSveLjubimceKojeOdgajas());
    }
}
