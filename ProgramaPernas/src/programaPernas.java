import java.util.Scanner;

public class programaPernas {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int pernas;
        String tipo;

        System.out.print("Quantas pernas: ");
        pernas = scan.nextInt();

        System.out.print("Isso é um(a) ");
        switch (pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "trípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "E.T";
                break;
        }
        System.out.println(tipo);
    }
}
