import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = scan.nextFloat();
        System.out.format("A nota de %s foi %.2f \n", nome, nota);
    }
}
