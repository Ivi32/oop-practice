public abstract class Geometrija {
    private String ime;

    public Geometrija(String ime) {
        this.ime = ime;
    }

    public void setIme(String ime) {this.ime = ime;}
    public String getIme() {return ime;}

    public abstract double povrsina();

}
