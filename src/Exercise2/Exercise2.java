package Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("Inserisci un numero compreso tra 0 e 3");
            num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 0:
                    System.out.println("zero");
                    exit = true;
                    break;
                case 1:
                    System.out.println("uno");
                    exit = true;
                    break;
                case 2:
                    System.out.println("due");
                    exit = true;
                    break;
                case 3:
                    System.out.println("tre");
                    exit = true;
                    break;
                default:
                    System.out.println("Hai inserito un numero non compreso tra 0 e 3");
            }
        }


    }
}
