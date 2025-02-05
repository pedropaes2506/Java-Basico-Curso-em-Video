import java.util.Scanner;

public class repeticaoContador {
    public static void main(String[] args) throws Exception {
        int inicio, fim, passo;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o início da contagem: ");
        inicio = scan.nextInt();
        System.out.print("Informe o fim da contagem: ");
        fim = scan.nextInt();
        System.out.print("Informe o passo da contagem: ");
        passo = scan.nextInt();

        if (fim > inicio) {
            for (int i = inicio; i <= fim; i += passo) {
                System.out.println(i);
            }
        }
        else if (inicio > fim) {
            for (int i = inicio; i >= fim; i -= passo) {
                System.out.println(i);
            }
        }
        else {
            System.out.println(inicio);
        }
    }
}
