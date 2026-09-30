public class G1 {
    public static void main(String[] args) {
        int n = 10;
        // Del c: Bytt verdien av n og kjør på nytt.
        // I del b brukes i <= 10 som betingelse i stedet.
        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
        // Når n er negativt, er 1 < n usant: løkken kjøres ikke.
    }
}
