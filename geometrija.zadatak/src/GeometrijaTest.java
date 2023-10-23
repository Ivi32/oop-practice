public class GeometrijaTest {
    public static void main(String[] args) {
        Pravougaonik p = new Pravougaonik(2, 3);
        System.out.println(p);

        Kvadrat k = new Kvadrat(10);
        System.out.println(k);
        System.out.println("============");

        Elipsa e = new Elipsa(2, 3);
        System.out.println(e.obim());
        System.out.println(e.povrsina());
        System.out.println("============");

        Krug krug = new Krug(5);
        System.out.println(krug.obim());
        System.out.println(krug.povrsina());
    }
}
