public class Palindromo {

    public static boolean esPalindromo(String palabra) {
        // Eliminar espacios y convertir a minúsculas para evitar problemas de espaciado
        // y mayúsculas
        palabra = palabra.replaceAll("\\s", "").toLowerCase();
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palabra = "arenera";
        boolean resultado = esPalindromo(palabra);
        System.out.println("la palabra " + palabra + " es un palindromo? " + resultado);
    }
}