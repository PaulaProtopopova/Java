import java.util.Scanner;
public class SortedAsciiSymbols {
    public static void main(String[] args) {


        for (int i = 97; i < 123; i++) {
            System.out.printf("%s   ", (char) i);
        }
        System.out.println();
        for (int y = 65; y < 91; y++) {
            System.out.printf("%s   ", (char) y);
        }
        System.out.println();
        for (int z = 33; z < 65; z++) {
            System.out.printf("%s   ", (char) z);
        }
        System.out.println();
    }
}
