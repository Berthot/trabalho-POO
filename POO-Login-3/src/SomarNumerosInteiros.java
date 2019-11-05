import javax.swing.JOptionPane;
public class SomarNumerosInteiros {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Primeiro número inteiro");
        while (NumeroInteiroValido(s1)) {
            s1 = JOptionPane.showInputDialog(null,
                    "Entrada inválida! Digite um número inteiro.");
        }
        String s2 = JOptionPane.showInputDialog(null, "Segundo número inteiro");
        while (NumeroInteiroValido(s2)) {
            s2 = JOptionPane.showInputDialog(null,
                    "Entrada inválida! Digite um número inteiro.");
        }
        int soma = new Integer(s1) + new Integer(s2);
        JOptionPane.showMessageDialog(null, "A soma de "
                + s1 + " e " + s2 + " é " + soma);
    }
    private static boolean NumeroInteiroValido(String s) {
        boolean resultado;
        try {
            Integer.parseInt(s);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return !resultado;
    }
}