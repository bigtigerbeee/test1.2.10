public class Class {
    public static void main(String[] args) {
    }

    public static boolean doubleExpression(double a, double b, double c) {
        boolean x = Math.abs((a + b) - c) < 1E-4;
        return x;
    }
}

