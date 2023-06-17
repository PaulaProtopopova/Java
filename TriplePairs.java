import java.util.Scanner;

public class TriplePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int x = 97; x < 97 + number; x++) {
            for (int y = 97; y < 97 + number; y++) {
                for (int z = 97; z < 97 + number; z++) {
                    System.out.printf("%s %s %s", (char) x, (char) y, (char) z);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
