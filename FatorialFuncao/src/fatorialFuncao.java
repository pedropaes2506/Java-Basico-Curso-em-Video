import java.util.Scanner;

public class fatorialFuncao {
    public static void main(String[] args) throws Exception {
        Fatorial f = new Fatorial();
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Digite um número para calcular seu fatorial: ");
        n = scan.nextInt();

        f.calculoFatorial(n);
        
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
