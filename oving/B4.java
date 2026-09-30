import javax.swing.JOptionPane;

public class B4 {
    public static void main(String[] args) {
        String tekstX = JOptionPane.showInputDialog("Skriv x (desimaltall):");
        if (tekstX == null) return;
        String tekstN = JOptionPane.showInputDialog("Skriv n (positivt heltall):");
        if (tekstN == null) return;
        double x = Double.parseDouble(tekstX.replace(',', '.'));
        int n = Integer.parseInt(tekstN);
        if (n <= 0 || !Double.isFinite(x)) {
            JOptionPane.showMessageDialog(null, "n må være positivt, og x må være et endelig tall.");
            return;
        }
        double resultat = 1.0;
        int i = 0;
        while (i < n) {
            resultat = resultat * x;
            i++;
        }
        double potens = Math.pow(x, n);
        JOptionPane.showMessageDialog(null,
                x + " opphøyd i " + n + "\nMed while-løkke: " + resultat
                + "\nMed Math.pow: " + potens);
    }
}
