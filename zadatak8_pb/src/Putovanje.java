import java.util.ArrayList;

public class Putovanje {
    //Napisati klasu Putovanje koja ima sledeca polja/atribute:
    //	- destinacija(Grad)
    //	- vodjaPuta (Osoba)
    //	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
    //	- udaljenostUKm (double)
    //	- prijavljeneOsobe (arrayList)
    //udaljenostUKm ne sme biti negativna. Ispisati poruku o gresci ako korisnik pokusa da napravi Putovanje sa negativnom udaljenoscu.
    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
    //Napisati sledece metode:
    //	2 konstruktora -> vodja puta ne mora da postoji, u oba konstruktora ne treba slati niz prijavljeneOsobe,
    //	vec u oba konstruktora ovaj niz napravite kao prazan
    //	gettere settere
    //	toString metodu koristeci StringBuilder
    //	format
    //	Destincija: <ImeGrada, ImeDrzave>
    //	Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta' ako vodja puta nije postavljen (null)>
    //	Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
    //	Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
    //	Prijavljene osobe:
    //		<ime> <prezime>
    //	Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
    //	i onda napravite neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
    //	i onda prijavite neke od osoba na neka od putovanja,
    //	i onda pozovite i metodu za racunanje koliko je vremena potrebno da se stigne pri odredjenoj brzini.
    //
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if(udaljenostUKm < 0)
            System.out.println("Greska");
        else
            this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = new ArrayList<Osoba>();
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        this.udaljenostUKm = udaljenostUKm;
        this.prijavljeneOsobe = new ArrayList<Osoba>();
    }

    public Putovanje() {
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if(udaljenostUKm < 0)
            System.out.println("greska");
        else
            this.udaljenostUKm = udaljenostUKm;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }
    //napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri odredjenoj prosecnoj brzini.
    // Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double)
    //ce biti prosecna brzina automobila, a da vrati koliko ce sati biti potrebno da se dodje do destinacije
    //ako se auto bude vozio tom prosecnom brzinom.

    public double vremePutovanja(double brzina){
        return udaljenostUKm/brzina;
    }
    //napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje
    public void prijava(Osoba o){
        prijavljeneOsobe.add(o);
    }

    //napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)

    public void odjava(Osoba o){

        prijavljeneOsobe.remove(o);
    }

    //sa remove je uvek zeznuto sta ce i kako da ukloni, ponekad radi kao npr ovde, ali sigurnije je indeksno da se ukloni,
    //npr pravi je problem u 13 zadatku, ako imas k puta krusku a hoces da uklonis jednom, remove ukloni sve kruske


    public void odjavaIndeksno(Osoba o) {
        for (Osoba n:prijavljeneOsobe) {
            if(n.uporedi(o))
                prijavljeneOsobe.remove(n);
            break;
        }
    }

    public void odjavaIndeksno1(Osoba o) {
        for (Osoba n:prijavljeneOsobe) {
            if(n.uporedi(o))
                prijavljeneOsobe.remove(o);
            break;
        }
    }

    //Destincija: <ImeGrada, ImeDrzave>
    //Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta' ako vodja puta nije postavljen (null)>
    //    //	Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
    //    //	Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
    //    //	Prijavljene osobe:
    //    //		<ime> <prezime>
    //    //		<ime> <prezime>
    //    //		<ime> <prezime>
    //    //		<ime> <prezime>
    //    //		....
    //    //	primer
    //    //	Destincija: Pariz, Francuska
    //    //	Vodja puta je: Petar Petrovic
    //    //	Putuje se automobilom: BMW, 2016, 192000
    //    //	Udaljenost do destinacije je: 1300
    //    //	Prijavljene osobe:
    //    //		Zoran Milicevic
    //    //		Pera Peric
    //    //		Marko Markovic


    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       if(vodjaPuta == null)
           sb.append("Nema vodje puta.");
       else
           sb.append("Vodja puta je: ").append(vodjaPuta.getIme()).append(" ").append(vodjaPuta.getPrezime()).append("\n");
       sb.append("Putuje se automobilom: ").append(vozilo.toString()).append("\n");
       sb.append("Udaljenost od destinacije u km je: ").append(udaljenostUKm).append("\n");
       sb.append("Prijavljene osobe: ").append("\n");
        for (Osoba o:prijavljeneOsobe) {
            sb.append(o.toString()).append("\n");
        }
          return sb.toString();
       }
    }

