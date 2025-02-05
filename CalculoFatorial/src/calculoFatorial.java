import java.util.Scanner;

public class calculoFatorial {
    public static void main(String[] args) throws Exception {
        int num, numTemp, fat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para calcular seu fatorial: ");
        num = scan.nextInt();
        fat = num;
        numTemp = num;

        while (numTemp > 1) {
            fat = fat * (numTemp - 1);
            numTemp--;
        }

        System.out.println("O fatorial de " + num + " é " + fat);
    }
}
