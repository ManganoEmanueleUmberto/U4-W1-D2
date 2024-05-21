package Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String word = "";
        String wordWithComma = "";
        boolean exit = false;
        String exitWord = ":q";

        Scanner sc = new Scanner(System.in);
        while (!exit) {

            System.out.println("Inserisci una stringa   :q per uscire");
            word = sc.nextLine();
            if (word.equals(exitWord)) {
                exit = true;
            }
            for (int i = 0; i < word.length(); i++) {
                if (i == word.length() - 1) wordWithComma = wordWithComma + word.charAt(i);
                else wordWithComma = wordWithComma + word.charAt(i) + ",";


            }
            System.out.println(wordWithComma);

        }

        sc.close();
    }
}
