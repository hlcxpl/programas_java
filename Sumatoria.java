
public class Sumatoria {
    public static int sumPrimeros(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumPrimeros(n - 1);
        }
    }

    public static void main(String[] args) {
    int number=5;
    int result = sumPrimeros(number);
    System.out.println("La sumatoria de " + number + " es: " + result);
    }
}