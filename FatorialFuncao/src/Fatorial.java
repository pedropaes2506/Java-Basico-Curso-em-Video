public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void calculoFatorial(int n) {
        num = n;
        int f = 1;
        String s = "";
        
        for (int i = num; i > 1; i--) {
            f *= i;
            s += i + " x ";
        }

        s += "1 = ";
        fat = f;
        formula = s;
    }

    public int getFatorial() {
        return fat;
    }

    public String getFormula() {
        return formula;
    }
}
