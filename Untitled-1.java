
public class sumatoria {
    public static int sumPrimeros(int n){
        if(n==0){
            return=0;
        }else{
            return n + sumPrimeros(n-1);
        }
    }
}

public static void main(String[] arg) {
    int number = 5;
    int result = sumPrimeros(number);
    system.out.println("El sumatoria de " + number + " es:" + result);

}