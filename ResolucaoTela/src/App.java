import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();
        System.out.println("Sua tela tem resolução " + largura + " x " + altura);
    }
}
