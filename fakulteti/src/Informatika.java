import java.util.List;

public class Informatika extends Departman{

    public Informatika(List<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    public Informatika() {
    }

    @Override
    public double finansije() {
        return (this.getListaStudenata().size()/2)*5000;
    }
}
