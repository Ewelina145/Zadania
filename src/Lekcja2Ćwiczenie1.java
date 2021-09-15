import java.util.Scanner;

public class Lekcja2Ćwiczenie1 {
    public static void main(String[] args) {

/*
        for (int j = 1; j <= 5; j++) {
            System.out.print(j + ": ");
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki");
        int tree = scanner.nextInt();

        for (int i = tree; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print(" ");
            for (int k = 2 * (tree - i) + 1; k > 0; k--)
                System.out.print("*");
            System.out.println();
        }
        for (int i = tree; i > 0; i--) {
            for (int j = i; j <= tree + 1; j++)
                System.out.print(" ");
            for (int j = (2 * (i - 1)) - 1; j > 0; j--)
                System.out.print("*");
            System.out.println();

        }
    }
}