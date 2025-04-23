public class MultiplyDivideWithoutOperators {
    public static int multiply(int a, int b) {
        int result = 0;
        boolean negative = (a < 0) ^ (b < 0); 
        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++)
            result += a;

        return negative ? -result : result;
    }

    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");

        int quotient = 0;
        boolean negative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);

        while (a >= b) {
            a -= b;
            quotient++;
        }

        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication: " + multiply(5, -3));
        System.out.println("Division: " + divide(10, 2));
    }
}
