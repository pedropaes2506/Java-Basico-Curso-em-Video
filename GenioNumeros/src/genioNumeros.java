import java.util.Scanner;

public class genioNumeros {
    public static void main(String[] args) throws Exception {
        int valor, chute;
        Scanner scan = new Scanner(System.in);

        valor = (int) (1 + Math.random() * (6 - 1));
        System.out.print("Tente adivinhar um número entre 1 e 5: ");
        chute = scan.nextInt();

        String frase1 = "ACERTOU!";
        String frase2 = "ERROU! Eu pensei no valor " + valor;
        String resposta = (valor == chute)?frase1:frase2;

        System.out.println(resposta);
    }
}
