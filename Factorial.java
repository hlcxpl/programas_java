public class Factorial {
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = calcularFactorial(number);
        System.out.println("El factorial de " + number + " es: " + result);
    }
}
