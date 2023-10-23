import java.util.List;

public class Biologija extends Departman{
    //Napraviti klase Biologija, Informatika i Hemija koje nasledjuju klasu Departman.
//Skolarina po Studentu za Biologiju-3000, za Hemiju-4000 a Informatika-5000 //65 bodova

    ////double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    ////racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    ////Departmanu za Biologije gde nema ni jedno budzetsko mesto


    public Biologija(List<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    public Biologija() {
    }

    @Override
    public double finansije() {
        return this.getListaStudenata().size()*3000;
    }
}
