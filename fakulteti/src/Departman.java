import java.util.ArrayList;
import java.util.List;

public abstract class Departman {
    ////Napraviti abstraktnu klasu Departman koja ima sledece atribute:
    ////-(List<Student>) Listu studenata
    ////-(String) naziv
    private List<Student> listaStudenata;
    private String naziv;

    public Departman(List<Student> listaStudenata, String naziv) {
        this.listaStudenata = listaStudenata;
        this.naziv = naziv;
    }

    public Departman() {

    }

    public List<Student> getListaStudenata() {
        return listaStudenata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setListaStudenata(List<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    ////Kreirati metode:
    ////List<Student> vredni(int prosek) - Metoda koja vraca listu Studenata koji imaju veci prosek
    ////od prosledjenog.

    public List<Student> vredni(double prosek){
        List<Student> vredni = new ArrayList<>();
        for (Student s:listaStudenata) {
            if(s.prosek() > prosek)
                vredni.add(s);
        }
        return vredni;
    }
    ////double prosekSvih() - Metoda koja vraca prosek svih Studenata sa Departmana.
    public double prosekSvih(){
        double suma = 0;
        for (Student s:listaStudenata) {
            suma += s.prosek();
        }
        return suma/listaStudenata.size();
    }
    ////double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    ////racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    ////Departmanu za Biologije gde nema ni jedno budzetsko mesto.

    public abstract double finansije();

}
