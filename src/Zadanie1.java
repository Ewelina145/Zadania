import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek:");
        int age=scanner.nextInt();

        if(age<=0) return;

        if(age>=1 && age<18){
            System.out.println("Jesteś dzieckiem.");
        } else if(age>=18 && age<55){
            System.out.println("Jesteś w młodym wieku.");
        } else if(age>=55 && age<70){
            System.out.println("Jesteś w średnim wieku.");
        } else if(age>=70){
            System.out.println("Jesteś w starszym wieku.");
        }
    }
}