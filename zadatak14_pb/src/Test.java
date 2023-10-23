import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Ljubimac> ljubimci = Arrays.asList(
                new Ljubimac("LjubimacIme1", "pas", 4, false, 4.6),
                new Ljubimac("LjubimacIme2", "pas", 4, false, 3.6),
                new Ljubimac("LjubimacIme3", "macka", 4, false, 2.6),
                new Ljubimac("LjubimacIme4", "macka", 4, false, 2.1),
                new Ljubimac("LjubimacIme5", "macka", 4, false, 2.3),
                new Ljubimac("LjubimacIme6", "papagaj", 2, true, 1.6),
                new Ljubimac("LjubimacIme7", "papagaj", 2, true, 1.4),
                new Ljubimac("LjubimacIme8", "hrcak", 4, false, 0.8),
                new Ljubimac("LjubimacIme9", "hrcak", 4, false, 0.6)
        );
        Odgajivac o1 = new Odgajivac("Pera", "Peric", 20, ljubimci, "pas");
        System.out.println("--------------------------");
        System.out.println(o1.toString());

        System.out.println("--------------------------");
        Vlasnik v1 = (Vlasnik) o1;
        System.out.println(v1.toString());
    }
    }

