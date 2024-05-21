package Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(annoBisestile(2096));
    }

    public static boolean stringaPariDispari(String query) {
        return query.length() % 2 == 0;
    }

    public static boolean annoBisestile(int year) {
        return year % 4 == 0 || year % 100 == 0 && year % 400 == 0;
    }
}
