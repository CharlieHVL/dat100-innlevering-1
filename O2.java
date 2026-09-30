import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int student = 1; student <= 10; student++) {
            System.out.println("Poengsum for student " + student + " (0–100):");
            int poeng = input.nextInt();
            // Samme student må prøve igjen ved ugyldig poengsum.
            while (poeng < 0 || poeng > 100) {
                System.out.println("Ugyldig poengsum. Skriv et heltall fra 0 til 100:");
                poeng = input.nextInt();
            }
            char karakter;
            if (poeng >= 90) {
                karakter = 'A';
            } else if (poeng >= 80) {
                karakter = 'B';
            } else if (poeng >= 60) {
                karakter = 'C';
            } else if (poeng >= 50) {
                karakter = 'D';
            } else if (poeng >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }
            System.out.println("Karakter: " + karakter);
        }
    }
}
