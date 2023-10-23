public class FilmNaStanju {
    //Napisati klasu FilmNaStanju koja sadrzi atribute:
    //	- Film film
    //	- int kolicina (koliko kopija datog filma ima u nekom video klubu)
    //	- double cena (koliko kosta dati film da se iznajmi u nekom video klubu)
    //
    //Napisati konstruktor(e).
    //Napisati toString() metod:
    //	"{imeFilma} - {cena} | Na stanju: {kolicina}"
     private Film film;
     private int kolicina;
     private double cena;

    public FilmNaStanju(Film film, int kolicina, double cena) {
        this.film = film;
        this.kolicina = kolicina;
        this.cena = cena;
    }

    public FilmNaStanju() {
    }

    public Film getFilm() {
        return film;
    }

    public int getKolicina() {
        return kolicina;
    }

    public double getCena() {
        return cena;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(film.getIme()).append(" ").append(cena).append(" | ").append("Na stanju: ").append(kolicina);
        return sb.toString();
    }
}
