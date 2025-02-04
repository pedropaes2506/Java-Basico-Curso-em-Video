import java.util.Scanner;

public class idadeVoto {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int anoNasc, anoAtual, idade;

        System.out.print("Ano de nascimento: ");
        anoNasc = scan.nextInt();
        anoAtual = 2025;
        idade = anoAtual - anoNasc;

        System.out.println("Sua idade é " + idade);
        if (idade < 16) {
            System.out.println("Não vota!");
        }
        else if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto opcional!");
        }
        else {
            System.out.println("Voto obrigatório");
        }
    }
}
