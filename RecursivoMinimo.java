import java.util.Arrays;

public class RecursivoMinimo {
    public static int minimo(int[] arreglo) {

        if (arreglo.length < 1 || arreglo.length > 1000) {
            return -1; 
        }

        for (int num : arreglo) {
            if (num < 0 || num > 1000) {
                return -1; 
            }
        }

        if (arreglo.length == 1) {
            return arreglo[0];
        }

        else {

            int[] subarreglo = Arrays.copyOfRange(arreglo, 1, arreglo.length);

            return Math.min(arreglo[0], minimo(subarreglo));
        }
    }
    public static void main(String[] args) {
        int[] arreglo = {2,3,4,5,6};
        int result= minimo(arreglo);
        System.out.println("El numero minimo del arrelgo: "+arreglo[0]+arreglo[1]+arreglo[2]+arreglo[3]+arreglo[4]+" es: "+result);
    }
}
 