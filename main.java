import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word: ");
        String word = scanner.next();
        char[] charArray = word.toCharArray();

        int clear = 0;
        while (clear < 100) {
            System.out.println(" ");
            clear++;
        }
        int i = 0;
        int point = 0;
        int hanged = 0;
        while (i < charArray.length && hanged < 10) {
            int length = charArray.length;
            for (int o = 0; o < length; o++) {
                System.out.print("?");
            }
            int y = 0;
            while (y < 2) {
                System.out.println(" ");
                y++;
            }
            System.out.println("Enter your first guess: ");
            char guess = scanner.next().charAt(0);
            boolean found = false;
            for (char wantedChar : charArray) {
                if (wantedChar == guess) {
                    System.out.println("Find Characters" + wantedChar);
                    System.out.println("Nice Job!");
                    point++;
                    found = true;
                }
            } if (!found) {
                System.out.println("Uh Oh Your Guess was wrong");
                hanged++;
            }
            if (point == charArray.length) {
                System.out.println("You Did It!");
                System.out.println("Word is " + Arrays.toString(charArray));
                break;
            }
            i++;
        }
    }
}
