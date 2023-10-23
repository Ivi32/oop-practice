import java.util.ArrayList;
import java.util.List;

public class Fakultet implements Studije{
    ////Klasa Fakultet implementira interfejs Studije i kao argument ima listu departmana
    private List<Departman> listaDepartmana;

    public Fakultet(List<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public Fakultet() {
    }

    public List<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(List<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    @Override
    public void dodajStudenta(Departman d, Student s) {
        int indexDepartmana = listaDepartmana.indexOf(d);
        listaDepartmana.get(indexDepartmana).getListaStudenata().add(s);
    }

    @Override
    public void izbaciStudenta(Departman d, Student s) {
        int indexDepartmana = listaDepartmana.indexOf(d);
        int indexStudenta = listaDepartmana.get(indexDepartmana).getListaStudenata().indexOf(s);
        listaDepartmana.get(indexDepartmana).getListaStudenata().remove(indexStudenta);
    }

    @Override
    public Departman najvecaZarada() {
        Departman sNajvecomZaradom = listaDepartmana.get(0);
        for (Departman d:listaDepartmana) {
            if(d.finansije() > sNajvecomZaradom.finansije())
                sNajvecomZaradom = d;
        }
        return sNajvecomZaradom;
    }

    @Override
    public List<Student> sviApsolventi() {
        List<Student> apsolventi = new ArrayList<>();
        for (Departman d:listaDepartmana) {
            for (Student s: d.getListaStudenata()) {
                if (s.getTrenutnaGodinaStudiranja() == 4)
                    apsolventi.add(s);
            }
        }
        return apsolventi;
    }
}
