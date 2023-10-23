import java.awt.*;

public class Test {
    //Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
    //    //	i onda napravite neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
    //    //	i onda prijavite neke od osoba na neka od putovanja,
    //    //	i onda pozovite i metodu za racunanje koliko je vremena potrebno da se stigne pri odredjenoj brzini.
    //    //
    public static void main(String[] args) {


        Grad grad = new Grad("Beograd", 3000000, "Srbija");
        Grad grad1 = new Grad("Subotica", 200000, "Srbija");

        Automobil automobil = new Automobil("Audi", 2018, 102000);
        Automobil automobil1 = new Automobil("Fiat", 2000, 33000);

        Osoba osoba = new Osoba("Ema", "Brajkovic");
        Osoba osoba1 = new Osoba("Ivi", "Brajkovic");
        Osoba osoba2 = new Osoba("Ivi", "Brajkovic");

        Putovanje putovanje = new Putovanje(grad, osoba, automobil, 500);
        System.out.println(putovanje);
        System.out.println("===========");
        putovanje.prijava(osoba1);
        putovanje.prijava(osoba2);
        System.out.println(putovanje);
        System.out.println("=============");
        System.out.println(putovanje.vremePutovanja(100));
        System.out.println("============");
        //putovanje.odjava(osoba1);
        putovanje.odjavaIndeksno1(osoba1);
        System.out.println(putovanje);



    }
}
