import java.math.BigInteger;
import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et positivt heltall n:");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.println("n må være større enn 0. Prøv igjen:");
            n = input.nextInt();
        }
        // BigInteger unngår at svaret blir feil når fakultetet overstiger long.
        BigInteger fakultet = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            fakultet = fakultet.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + fakultet);
    }
}
