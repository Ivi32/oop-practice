public abstract class Oblik {
    //
    //18.
    //Napisati abstraktnu klasu Oblik koja nema atribute
    //
    //Napisati jedan prazan konstruktor
    //
    //Napisati abstraktne metode:
    //1. double obim() - koja racuna obim oblika
    //2. double povrsina() - koja racuna povrsinu oblika
    //3. double zapremina - koja racuna zapreminu oblika
    //4. String getIme() - koja vraca ime oblika
    //
    //Napisati metode:
    //1. String getOsobine() koja vraca nisku oblika:
    //"Obim: <obim>
    // Povrsina: <povrsina>
    // Zapremina: <zapremina>"
    //
    //Overridovati toString() metod na sledeci nacin:
    //"<ime>
    // getOsobine()"


    public Oblik() {
    }

    public abstract double obim();
    public abstract double povrsina();
    public abstract double zapremina();
    public abstract String getIme();

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append("\n");
        sb.append("Obim: ").append(obim()).append("\n");
        sb.append("Povrsina: ").append(povrsina()).append("\n");
        sb.append("Zapremina: ").append(zapremina());
        return sb.toString();
    }
}
