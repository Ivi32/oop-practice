public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Osoba() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public boolean uporedi(Osoba o){
        if(this.ime.equalsIgnoreCase(o.ime) && this.prezime.equalsIgnoreCase(o.prezime))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime);
        return sb.toString();
    }
}
