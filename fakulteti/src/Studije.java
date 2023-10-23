import java.util.List;

public interface Studije {
    //Napraviti Interfejs Studije koje implementiraju metode:
//-void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz
//Departmana.
//-void izbaciStudenta(Departman d, Student s) - Izbacuje studenta iz liste za odredjen
//Departman
//-Departman najvecaZarada() - Vraca departman koji donosi najvise para fakultetu
//-List<Student> sviApsolventi() - Vraca listu studenata koji su cetvrta godina

    void dodajStudenta(Departman d, Student s);
    void izbaciStudenta(Departman d, Student s);
    Departman najvecaZarada();
    List<Student> sviApsolventi();
}
