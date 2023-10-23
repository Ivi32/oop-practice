public abstract class Zivotinja {

    /*Napisati abstraktnu klasu Zivotinja koja ima atribute:
            - String naziv

    Napisati sve odogvarajuce konstruktore

    Napisati sve gettere i settere

    Napisati abstraktne metode:
            1. void leti() koja ispisuje poruku:
            "Ja letim"; ukoliko zivotinja moze da leti
 "Ja ne mogu da letim"; inace
2. void pliva() koja ispisuje poruku:
            "Ja plivam"; ukoliko zivtonja iskljucivo pliva
 "Ja ne plivam"; inace
3. int brojNogu() koja vraca broj nogu zivotinje
4. boolean daLiJeDomaca() koja vraca odgovor na pitanje da li je zivotinja domaca ili ne
5. void oglasiSe() - koja ispisuje onomatopeju koja ta zivotinja izgovara.
            (pas -> "woof"
    macka -> "nyaa"
    konj -> "pfff"
    ovca -> "bmee"
    krava -> "muuu"
    lav -> "roar"
    kokoska -> "kukuriku"
    zmija -> "ssss"
    delfin -> "<3")
         */
    private String naziv;

    public Zivotinja(String naziv) {
        this.naziv = naziv;
    }

    public Zivotinja() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    //Napisati abstraktne metode:
    //            1. void leti() koja ispisuje poruku:
    //            "Ja letim"; ukoliko zivotinja moze da leti
    // "Ja ne mogu da letim"; inace
    //2. void pliva() koja ispisuje poruku:
    //            "Ja plivam"; ukoliko zivtonja iskljucivo pliva
    // "Ja ne plivam"; inace
    //3. int brojNogu() koja vraca broj nogu zivotinje
    //4. boolean daLiJeDomaca() koja vraca odgovor na pitanje da li je zivotinja domaca ili ne
    //5. void oglasiSe() - koja ispisuje onomatopeju koja ta zivotinja izgovara.
    //            (pas -> "woof"
    //    macka -> "nyaa"
    //    konj -> "pfff"
    //    ovca -> "bmee"
    //    krava -> "muuu"
    //    lav -> "roar"
    //    kokoska -> "kukuriku"
    //    zmija -> "ssss"
    //    delfin -> "<3")

    public abstract void leti();
    public abstract void pliva();

    public abstract int brojNogu();
    public abstract boolean daLiJeDomaca();
    public abstract void oglasiSe();

}
