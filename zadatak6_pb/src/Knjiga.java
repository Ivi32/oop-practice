public class Knjiga {
    //Napisati klasu Knjiga koja ima sledeca polja/atribute:
    //nazivKnjige (string),
    //autor (Osoba),
    //vlasnik (Osoba)
    //brojStrana (int),
    //godinaIzdanja (int).
    //Broj strana i godina izadanje ne mogu biti negativni.
    // Ispisati poruku o gresci ako korisnik pokusa da napravi knjigu sa negativnim brojem strana ili godinom izdanja
    // (u konstruktoru, jer se tamo 'pravi' knjiga).
    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.
    //Napisati sledece metode
    //	2 konstruktora. Knjiga ne mora imati vlasnika -> dakle jedan konstruktor gde se salje i ko je vlasnik,
    //	drugi konstruktor gde se ne salje ko je vlasnik
    //	getter i setter metode za sva polja
    //	toString koristeci stringBuilder
    //	format
    //		Naziv knjige je: <naziv knjige>
    //		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
    //		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
    //		Broj strana: <broj strana>
    //		Godina izdanja: <godina izdanja>
    //	napisati i metodu "velicinaKnjige" koja vraca string
    //		- "mala knjiga" - ako je broj strana od 0 do 100
    //		- "srednje velika knjiga" - ako je broj strana od 101 do 300
    //		- "velika knjiga" - ako je broj strana od 301-600
    //		- "bas velika knjiga" - ako je broj strana 601 i vise
    //

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {

        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        if(brojStrana < 0)
            System.out.println("Neispravan unos.");
        else
            this.brojStrana = brojStrana;
        if(godinaIzdanja < 0 )
            System.out.println("Neispravan unos.");
        else
            this.godinaIzdanja = godinaIzdanja;
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {

        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        if(brojStrana < 0)
            System.out.println("Neispravan unos.");
        else
            this.brojStrana = brojStrana;
        if(godinaIzdanja < 0 )
            System.out.println("Neispravan unos.");
        else
            this.godinaIzdanja = godinaIzdanja;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setBrojStrana(int brojStrana) {
        if(brojStrana<0)
            System.out.println("Greska");
        else
            this.brojStrana = brojStrana;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if(godinaIzdanja<0)
            System.out.println("Greska");
        this.godinaIzdanja = godinaIzdanja;
    }

    //napisati i metodu "velicinaKnjige" koja vraca string
    // - "mala knjiga" - ako je broj strana od 0 do 100
    // - "srednje velika knjiga" - ako je broj strana od 101 do 300
    // - "velika knjiga" - ako je broj strana od 301-600
    // - "bas velika knjiga" - ako je broj strana 601 i vise
    public String velicinaKnjige(){
        if(brojStrana<=100)
            return "mala knjiga";
        else if((brojStrana > 100) && (brojStrana<=300))
            return "srednja knjiga";
        else if((brojStrana > 300) && (brojStrana<=600))
            return "velika knjiga";
        else
            return "bas velika knjiga";
    }

    //Naziv knjige je: <naziv knjige>
    //Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
    //Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
    //Broj strana: <broj strana>
    //Godina izdanja: <godina izdanja>


    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Naziv knjige je: ").append(nazivKnjige).append("\n");
       if(autor == null)
           sb.append("knjiga nepoznatog autora.").append("\n");
        else
            sb.append("Autor knjige je: ").append(autor.getIme()).append(" ").append(autor.getPrezime()).append("\n");
        if(getVlasnik()==null)
            sb.append("knjiga nema vlasnika.").append("\n");
        else
            sb.append("Vlasnik knjige je: ").append(vlasnik.getIme()).append(" ").append(vlasnik.getPrezime()).append("\n");
        sb.append("Broj strana: ").append(brojStrana).append("\n");
        sb.append("Godina izdanja: ").append(godinaIzdanja);

        return sb.toString();

    }
}

