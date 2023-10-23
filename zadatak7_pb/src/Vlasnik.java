public class Vlasnik {
    private String ime;

    public Vlasnik(String ime) {
        this.ime = ime;
    }

    public Vlasnik() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("Vlasnik je: ").append(ime);
     return sb.toString();
    }
}
