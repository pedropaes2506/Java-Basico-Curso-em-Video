import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) throws Exception {
        Locale locale = Locale.getDefault();
        System.out.println("Seu sistema está em " + locale.getDisplayLanguage());
    }
}
