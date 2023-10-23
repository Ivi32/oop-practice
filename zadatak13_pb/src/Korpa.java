import java.util.ArrayList;

public class Korpa {
    //Napisati klasu Korpa koja ima atribute:
    //- ArrayList<Namirnice>
    //- double cenaKorpe
    //
    //Napisati podrazumevani konstruktor koji postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.
    //
    //Napisati sve gettere i settere
    //
    //Napisati metode:
    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.
    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.
    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    //7. cenaKrope - koja vraca ukupnu cenu korpe
    //
    //Overridovati toString() metod kao:
    //"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>"
    private ArrayList<Namirnica> namirniceUKorpi;
    private double cenaKorpe;

    public Korpa() {
        this.namirniceUKorpi = new ArrayList<>();
        this.cenaKorpe = 0;
    }

    public ArrayList<Namirnica> getNamirniceUKorpi() {
        return namirniceUKorpi;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setNamirniceUKorpi(ArrayList<Namirnica> namirniceUKorpi) {
        this.namirniceUKorpi = namirniceUKorpi;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }
    //dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n
    // i dodaje na cenuKorpe odgovarajucu cenu namirnice

    public void dodajUKorpu(Namirnica n) {
        namirniceUKorpi.add(n);
        cenaKorpe += n.getCena();
    }

    //dodajUkorpu(Namirnica n, int k) -
    // koja dodaje u korpu neku namirnicu n k puta
    // i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    public void dodajUKorpu(Namirnica n, int k) {
        for (int i = 0; i < k ; i++) {
            namirniceUKorpi.add(n);
            cenaKorpe += n.getCena();
        }
    }
    //ukloniIzKorpe(Namirnica n) -
    // koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    // kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    // artikla u korpi, uraditi nista.

    public void ukloniIzKorpe(Namirnica n) {
        for (Namirnica e : namirniceUKorpi) {
            if (e.daLiSuIsteNamirnice(n)) {
                namirniceUKorpi.remove(n);
                cenaKorpe -= e.getCena();
                break;
            }
        }
    }

    //ukloniIzKorpe(Namirnica n, int k) -
// koja radi kao metoda 3, s time sto brise k kopija takve namirnice.
// Ukoliko u korpi ima manje od k broja
// takve namirnice, obrisati sve takve namirnice.

    public void ukloniIzKorpe(Namirnica n, int k) {
        while (k > 0 && namirniceUKorpi.size() > 0){
            ukloniIzKorpe(n);
            k--;
        }
        /*int brojac = 0;
        for (Namirnica e : namirniceUKorpi) {
            if (e.equals(n))
                brojac++;
        }

        if (k >= brojac) {
            for (int i = 0; i < k; i++) {
                //namirniceUKorpi.remove(n);
                //cenaKorpe -= n.getCena();
                if (namirniceUKorpi.get(i).daLiSuIsteNamirnice(n)) {
                    namirniceUKorpi.remove(i);
                    cenaKorpe -= n.getCena();
                    i--;
                }
            }
        } else {
            for (int i = 0; i < k; i++) {
                //namirniceUKorpi.remove(n);
                //cenaKorpe -= n.getCena();
                if (namirniceUKorpi.get(i).daLiSuIsteNamirnice(n)) {
                    namirniceUKorpi.remove(i);
                    cenaKorpe -= n.getCena();
                    i--;
                }
            }
        }
        */
    }
    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.

    public void isprazniKorpu(){
        namirniceUKorpi.clear();
        cenaKorpe =0;
    }

    //cenaKrope - koja vraca ukupnu cenu korpe
    //zar to nije getter za korpu?
     public int brojKopijaNekeNamirnice(Namirnica namirnica){
        int brojac =0;
         for (Namirnica n:namirniceUKorpi) {
             if(namirnica.daLiSuIsteNamirnice(n))
                 brojac ++;
         }
         return brojac;
     }

     public double cenaSvihKopijaNekeNamirnice(Namirnica nam){
        return nam.getCena()*brojKopijaNekeNamirnice(nam);
     }
     ////Overridovati toString() metod kao:
    //    //"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    //    // ...
    //    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    //    // Cena korpe je: <cenaKopre>"

    //TODO optimizovati pozivanje metode brojKopijaNekeNamirnice()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Namirnica n:namirniceUKorpi) {
            sb.append(n.getIme()).append(" | ")
                    .append(brojKopijaNekeNamirnice(n)).append(" | ")
                    .append(cenaSvihKopijaNekeNamirnice(n)).append("\n");
        }
        sb.append("Cena korpe je:").append(cenaKorpe);
        return sb.toString();
    }
}


