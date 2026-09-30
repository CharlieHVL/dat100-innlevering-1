import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Del b: bruk i <= 1 for å kjøre bare én gang som i del a.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Skriv tall " + i + ":");
            double tall = input.nextDouble();
            System.out.println(tall);
        }
    }
}
