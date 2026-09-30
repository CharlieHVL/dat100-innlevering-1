public class G3 {
    public static void main(String[] args) {
        // Del c: samme resultat som switch-versjonen i G3Switch.java.
        for (int i = 1; i <= 20; i++) {
            if (i == 1) {
                System.out.println("A");
            } else if (i == 2) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}
