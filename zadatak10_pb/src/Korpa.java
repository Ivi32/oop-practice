import java.lang.reflect.Array;
import java.util.ArrayList;

public class Korpa {
    /*Napisati klasu Korpa koja sadrzi polja:
            - VideoKlub vk (neki video klub)
	- ArrayList korpa (korpa u koju mogu da se stavljaju filmovi koje neki kupac hoce da kupi)
	- double ukupnaCena (ukupna cena filmova u korpi)


    Napisati odogarajuc(e) konstruktor(e) i metode za ovu klasu.
    Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
    AKo zadatog filma nema na stanju ispisati poruku:
            "Film {f} nema na stanju."
    Napisati metodu dodajFilmaUKorpu(Film f, int n) - dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
    Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
            "Nije moguce kupiti {n} filmova {nazivFilma}.
    U korpu je dodato {brojKopija} kopija filma {nazivFilma}."
    Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe (pretpostaviti da takav film uvek postoji u korpi).
    Ispisati poruku:
            "Izbacili ste kopiju filma {nazivFilma} iz korpe".
    Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
            "Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
    Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
            "Izbacili ste sve kopije filma {nazivFilma} iz korpe."
    Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
            "Izbacili ste sve kopije filma {nazivFilma} iz korpe."
    Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
            "Korpa je sada prazna."
    Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
            "{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
            .
            .
            .
    {nazivFilmaN} {brojKopijaFilmaNUKorpi} {ukupnaCenaSvihKopijaFilmaNUKopri}"
    Ukupna cena: {ukupnaCena} svih filmova u korpi"

     */
    private VideoKlub vk;
    private ArrayList<Film> korpa;
    private double ukupnaCena;

    public Korpa(VideoKlub vk, ArrayList<Film> korpa) {
        this.vk = vk;
        this.korpa = korpa;
    }

    public Korpa() {
    }

    public VideoKlub getVk() {
        return vk;
    }

    public ArrayList<Film> getKorpa() {
        return korpa;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setVk(VideoKlub vk) {
        this.vk = vk;
    }

    public void setKorpa(ArrayList<Film> korpa) {
        this.korpa = korpa;
    }


    //Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
    //    AKo zadatog filma nema na stanju ispisati poruku:
    //            "Film {f} nema na stanju."

    public void dodajFilmUKorpu(Film f) {
        StringBuilder sb = new StringBuilder();
        boolean postojiNaStanju = false;
        for (FilmNaStanju fns : vk.getListaFilmovaUVideoKlubu()) {
            if (fns.getFilm().getIme().equalsIgnoreCase(f.getIme()) ) {
                postojiNaStanju = true;
                if (fns.getKolicina() > 0) {
                    korpa.add(f);
                    ukupnaCena += fns.getCena();
                    fns.setKolicina(fns.getKolicina() - 1);
                }
                else{
                    sb.append("Film ").append(f.getIme()).append(" nije na stanju.");
                    System.out.println(sb);
                }
            }
        }
        if(!postojiNaStanju){
            sb.append("Film ").append(f.getIme()).append(" nije dostupan u video klubu.");
            System.out.println(sb);
        }

    }

    //Napisati metodu dodajFilmaUKorpu(Film f, int n) -
    // dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
    //    Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
    //            "Nije moguce kupiti {n} filmova {nazivFilma}.
    //    U korpu je dodato {brojKopija} kopija filma {nazivFilma}."

    public void dodajFilmUKorpu(Film f, int n){

        StringBuilder sb = new StringBuilder();
        boolean postojiNaStanju = false;
        for (FilmNaStanju fns : vk.getListaFilmovaUVideoKlubu()) {
            if (fns.getFilm().getIme().equalsIgnoreCase(f.getIme()) ) {
                int preostaliBrojKopija = fns.getKolicina()-n;
                postojiNaStanju = true;
                if (preostaliBrojKopija >= 0) {
                    for (int i = 0; i < n; i++) {
                        korpa.add(f);
                        ukupnaCena += fns.getCena();
                    }
                    fns.setKolicina(fns.getKolicina() - n);
                }
                else{
                    for (int i = 0; i < fns.getKolicina(); i++) {
                        korpa.add(f);
                        ukupnaCena += fns.getCena();
                    }
                    fns.setKolicina(0);
                    sb.append("Nije moguce kupiti ").append(Math.abs(preostaliBrojKopija)).append(" filmova.");
                    sb.append("U korpu je dodato ").append(preostaliBrojKopija > 0 ? n : n+preostaliBrojKopija)
                            .append(" ").append(f.getIme());

                    System.out.println(sb);
                }
            }
        }
        if(!postojiNaStanju){
            sb.append("Film ").append(f.getIme()).append(" nije dostupan u video klubu.");
            System.out.println(sb);
        }
    }

    //  Napisati metod izbaciIzKorpe(Film f) -
    //  izbacuje jednu kopiju filma f iz korpe (pretpostaviti da takav film uvek postoji u korpi).
    //    Ispisati poruku:
    //    "Izbacili ste kopiju filma {nazivFilma} iz korpe".
    public void izbaciIzKorpe(Film f){
        //korpa.remove(f);

        for (Film fuk: korpa) {
            if (fuk.getIme().equalsIgnoreCase(f.getIme()))
                korpa.remove(f);
                ukupnaCena = ukupnaCena - vratiCenuFilma(f);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Izbacili ste kopiju filma ").append(f.getIme()).append(" iz korpe.");
        System.out.println(sb);
    }

    //Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
    //            "Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
    //    Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
    //            "Izbacili ste sve kopije filma {nazivFilma} iz korpe."

    public void izbaciIzKorpe(Film f, int n){
        StringBuilder sb = new StringBuilder();
        int brojUklonjenihFilmova = 0;
        for (Film fuk: korpa) {
            if (fuk.getIme().equalsIgnoreCase(f.getIme()))
            {
                korpa.remove(fuk);
                ukupnaCena = ukupnaCena - vratiCenuFilma(f);
                brojUklonjenihFilmova++;
            }
        }
        if (brojUklonjenihFilmova == n){
            sb.append("Izbacili ste sve kopije filma ")
                    .append(f.getIme())
                    .append(" iz korpe.");
        } else {
            sb.append("Izbacili ste ")
                    .append(brojUklonjenihFilmova)
                    .append(" kopija filma ")
                    .append(f.getIme())
                    .append(" iz korpe. ");
        }
    }

    //    Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
    //            "Korpa je sada prazna."

    public void izbaciSveIzKorpe(){
        korpa.clear();
        ukupnaCena = 0;
    }
    //    Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
    //            "{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
    public void ispisiInventarKorpe(){
        StringBuilder sb = new StringBuilder();
        for (Film f: korpa) {
            sb.append(f.getIme()).append(" ")
                    .append(vratiBrojKopija(f)).append(" ")
                    .append(vratiBrojKopija(f)*vratiCenuFilma(f));
        }
    }
    private int vratiBrojKopija(Film f){
        int brojKopija = 0;
        for (Film fuk: korpa) {
            if (fuk.getIme().equalsIgnoreCase(f.getIme()))
                brojKopija++;
        }
        return brojKopija;
    }
    private double vratiCenuFilma(Film f){
        double cenaFilma = 0.0;
        for (FilmNaStanju fns :vk.getListaFilmovaUVideoKlubu()) {
            if (fns.getFilm().getIme().equalsIgnoreCase(f.getIme())){
                cenaFilma = fns.getCena();
                break;
            }
        }
        return cenaFilma;
    }
}