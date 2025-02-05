import javax.swing.JOptionPane;

public class repeticaoValores {
    public static void main(String[] args) throws Exception {
        int num, totVal = 0, pares = 0, impares = 0, acima100 = 0, soma = 0, media;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor\n(0 interrompe)"));

            if (num % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }

            if (num > 100) {
                acima100++;
            }

            soma += num;
            totVal++;

        } while (num != 0);

        media = soma / totVal;

        JOptionPane.showMessageDialog(null, "Total de valores: " + totVal + "\nTotal de pares: " + pares + "\nTotal de ímpares: " + impares + "\nAcima de 100: " + acima100 + "\nMédia dos valores: " + media);
    }
}
