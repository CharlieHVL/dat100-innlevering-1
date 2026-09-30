import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv bruttoinntekt i kroner (bruk punktum ved desimaler):");
        double inntekt = Double.parseDouble(input.nextLine().replace(',', '.'));
        if (!Double.isFinite(inntekt) || inntekt < 0) {
            System.out.println("Ugyldig inntekt.");
            return;
        }

        // Satser for 2026: https://www.skatteetaten.no/satser/trinnskatt/?year=2026
        // Hver sats brukes bare på den delen av inntekten som ligger i trinnet.
        double skatt = 0;
        if (inntekt > 1467200) {
            skatt += (inntekt - 1467200) * 0.178;
            inntekt = 1467200;
        }
        if (inntekt > 980100) {
            skatt += (inntekt - 980100) * 0.168;
            inntekt = 980100;
        }
        if (inntekt > 725050) {
            skatt += (inntekt - 725050) * 0.137;
            inntekt = 725050;
        }
        if (inntekt > 318300) {
            skatt += (inntekt - 318300) * 0.04;
            inntekt = 318300;
        }
        if (inntekt > 226100) {
            skatt += (inntekt - 226100) * 0.017;
        }
        System.out.printf("Trinnskatt: %.2f kr%n", skatt);
    }
}
