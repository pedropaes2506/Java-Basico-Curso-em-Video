import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.print("Digite um número inteiro: ");
        num = scan.nextInt();
        
        int resDivPorDois = num % 2;
        int aoCubo = (int) Math.pow(num, 3);
        float raizQuad = (float) Math.sqrt(num);
        float raizCub = (float) Math.cbrt(num);
        int valAbs = Math.abs(num);

        System.out.println("Resto da divisão por 2: " + resDivPorDois);
        System.out.println("Elevado ao cubo: " + aoCubo);
        System.out.println("Raiz quadrada: " + raizQuad);
        System.out.println("Raiz cubica: " + raizCub);
        System.out.println("Valor absoluto: " + valAbs);
    }
}
