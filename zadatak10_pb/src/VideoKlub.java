import java.util.ArrayList;

public class VideoKlub {
    //Napisati klasu VideoKlub koja sadrzi polja:
    //	- String naziv (naziv video kluba)
    //	- ArrayList katalog (katalog svig filmova na stanju)

    private String naziv;
    private ArrayList<FilmNaStanju> listaFilmovaUVideoKlubu;
    //Napisati konstruktor(e).

    public VideoKlub(String naziv, ArrayList<FilmNaStanju> listaFilmovaUVideoKlubu) {
        this.naziv = naziv;
        this.listaFilmovaUVideoKlubu = listaFilmovaUVideoKlubu;
    }

    public VideoKlub() {
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<FilmNaStanju> getListaFilmovaUVideoKlubu() {
        return listaFilmovaUVideoKlubu;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setListaFilmovaUVideoKlubu(ArrayList<FilmNaStanju> listaFilmovaUVideoKlubu) {
        this.listaFilmovaUVideoKlubu = listaFilmovaUVideoKlubu;
    }

    //Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce.
    // Ako nije, ispisati na konzolu poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".

    public void iznajmiFilm(Film f) {
        StringBuilder sb = new StringBuilder();
        if (listaFilmovaUVideoKlubu.contains(f))
            listaFilmovaUVideoKlubu.remove(f);
        else {
            sb.append("Film ").append(f.getIme()).append(" trenutno nema na stanju");
            System.out.println(sb.toString());
        }
    }
    //Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
    //	iznajmiti sto vise kopija datog filma i ispisati poruku:
    //	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
    //	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".

    public void iznajmiFilm(Film f, int n) {
        StringBuilder sb = new StringBuilder();
        for (FilmNaStanju fns:listaFilmovaUVideoKlubu) {
            if (fns.getFilm().getIme().equalsIgnoreCase(f.getIme())) {
                if (fns.getKolicina() >= n) {
                    fns.setKolicina(fns.getKolicina() - n);
                }
                else if (fns.getKolicina() < n && fns.getKolicina() > 0) {
                    int brojKupacaKojiJosCekaNaIznjamljivanje = n - fns.getKolicina();
                    fns.setKolicina(0);
                    sb.append("Jos ")
                            .append(brojKupacaKojiJosCekaNaIznjamljivanje)
                            .append(" kupaca zeli da iznajmi film")
                            .append(f.getIme());
                    System.out.println(sb);
                }else if(fns.getKolicina() == 0) {
                    sb.append("Film").append(f.getIme()).append("trenutno nema na stanju");
                    System.out.println(sb);
                }
            }
            else {
                sb.append("Film").append(f.getIme()).append("nije dostupan za iznajmljivanje");
                System.out.println(sb);
            }
        }
    }
    //Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
    public void dodajFilm(Film f, double c){
        dodajFilm(f,c,1);

    }
    //Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
    public void dodajFilm(Film f, double c, int n){
        boolean filmPostoji = false;

        for (FilmNaStanju fns: listaFilmovaUVideoKlubu) {
            if(fns.getFilm().getIme().equalsIgnoreCase(f.getIme())) {
                fns.setKolicina(fns.getKolicina() + n);
                fns.setCena(c);
                filmPostoji = true;
                break;
            }
        }
        if (!filmPostoji){
            listaFilmovaUVideoKlubu.add(new FilmNaStanju(f,n,c));
        }

    }

    //Napisati metod pregledajFilm(Film f) - ispisuje na konozulu:
    //	"{imeFilma} - {cena} | Na stanju: {kolicina}"
    //	"{sadrzajFilma}"
    //	(ili "{imeFilma} | Nema na stanju")

    public void pregledajFilm(Film f) {
        StringBuilder sb = new StringBuilder();
        boolean postojiNaStanju= false;
        for (FilmNaStanju fns : listaFilmovaUVideoKlubu) {
            if (fns.getFilm().getIme().equalsIgnoreCase(f.getIme())) {
                sb.append(fns.getFilm().getIme()).append(" - ").append(fns.getCena())
                        .append(" | ").append("Na stanju: ").append(fns.getKolicina()).append("\n");
                sb.append(fns.getFilm().getSadrzaj()).append("\n");
                postojiNaStanju = true;
            }
        }
        if(!postojiNaStanju){
            sb.append(f.getIme()).append(" | ").append("Nema na stanju");
    }
        System.out.println(sb);
}

    //Napisati metod pregledajKatalog() - ispisuje ceo katalog na konzolu:
    //	"{imeFilma1} - {cena1} | Na stanju: {kolicina1}"
    //	.
    //	.
    //	.
    //	"{imeFilmaN} - {cenaN} | Na stanju: {kolicinaN}"

    public void pregledajKatalog(){
        StringBuilder sb = new StringBuilder();
        for (FilmNaStanju fns:listaFilmovaUVideoKlubu) {
            sb.append(fns.getFilm().getIme()).append(" - ").append(fns.getCena())
                    .append(" | ").append("Na stanju: ").append(fns.getKolicina()).append("\n");
        }
        System.out.println(sb);
    }
}
