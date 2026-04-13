import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SpellChecker sc = new SpellChecker();
        sc.loadWords();

        Scanner input = new Scanner(System.in);

        System.out.println("Simple Spell Checker");

        while (true) {
            System.out.print("Enter word (or exit): ");
            String word = input.nextLine();

            if (word.equals("exit")) break;

            if (sc.check(word)) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }
        }

        input.close();
    }
}