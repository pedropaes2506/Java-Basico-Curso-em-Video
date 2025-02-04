import java.util.Scanner;

public class equacaoSegundoGrau {
    public static void main(String[] args) throws Exception {
        int a, b, c, delta;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();
        System.out.print("Informe o valor de C: ");
        c = scan.nextInt();

        delta = (int) (Math.pow(b, 2) - 4 * a * c);

        System.out.println("O valor de delta é " + delta);
        if (delta < 0) {
            System.out.println("NÃO existem raízes REAIS");
        }
        else {
            System.out.println("Existem raízes REAIS");
        }
    }
}
