package Exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserisci un numero: ");
        num = Integer.parseInt(sc.nextLine());
        for (int i = num; i >= 0; i--) {
            System.out.println(num--);
        }
    }
}
