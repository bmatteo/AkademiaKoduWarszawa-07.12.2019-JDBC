package pl.academy.code;

public class Main {
    public static void main(String[] args) {
        try {
            d();
        } catch (NullPointerException e) {
            System.out.println("Metoda d() zwróciła błąd !!");
        }



        int[] tab = new int[10];

        //System.out.println(tab[10]);

        String a = null;

        try {
            //a.length();
            System.out.println(tab[10]);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("popsuło się !!");
        } finally {
            System.out.println("zawsze !!");
        }

        System.out.println("jgaskjasgdf");
    }

    String a = null;

    public static void a() {
        System.out.println("a");
        b();
    }

    public static void b() {
        System.out.println("b");
        c();
    }

    public static void c() {
        System.out.println("c");
        d();
        System.out.println("coś jeszcze !!");
    }
    public static void d() throws NullPointerException,
            IndexOutOfBoundsException {
        String a = null;
        a.length();
        System.out.println("d");

        try {
            validateNumber(101);
        } catch (AgeExceededException e) {
            e.printStackTrace();
        }

    }

    public static void validateNumber(int number)
            throws AgeExceededException {
        if(number > 100) {
            throw new AgeExceededException();
        }
    }
}
