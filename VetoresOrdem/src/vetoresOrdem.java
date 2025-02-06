import java.util.Arrays;
import java.util.Scanner;

public class vetoresOrdem {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        int cont = 0;
        int num;

        do {
            System.out.print("Digite um valor para adicionar ao vetor: ");
            num = scan.nextInt();
            vetor [cont] = num;
            cont++;
        } while (cont != 5);

        Arrays.sort(vetor);

        System.out.println("Aqui está seu vetor em ordem");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");   
        }

        System.out.println("");
    }
}
