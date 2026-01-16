
/**
 * Author: nFelix-457
 * Date: 22/02/2022
 * Description: Clase de demostración para probar el funcionamiento del método.
 **/

public class Main {

    /**
     * Crea una instancia de {@link Palindromo}
     * y evalúa diferentes palabras, imprimiendo en consola si cada una de ellas
     * es un palíndromo.
     */
    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        System.out.println(p.palindromo("ANA"));
        System.out.println(p.palindromo("FELIX")); //No es palindromo
        System.out.println(p.palindromo("RECONOCER"));
    }
}

