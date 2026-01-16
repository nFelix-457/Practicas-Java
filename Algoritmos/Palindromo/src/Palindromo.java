
/**
 * Author: nFelix-457
 * Date: 22/02/2022
 * Description: La clase {@code Palindromo} proporciona un método para determinar si una
 * cadena de texto es un palíndromo. Un palíndromo es una palabra que se lee
 * igual de izquierda a derecha que de derecha a izquierda.
 */
public class Palindromo {

    /**
     * Determina si la palabra proporcionada es un palíndromo.
     * @param palabra La palabra a evaluar. No debe ser {@code null}.
     * @return {@code true} si la palabra es un palíndromo; {@code false} en caso contrario.
     */
    public boolean palindromo(String palabra) {
        if (palabra.length() == 0 || palabra.length() == 1) {
            return true;
        }

        if (Character.toLowerCase(palabra.charAt(0)) ==
                Character.toLowerCase(palabra.charAt(palabra.length() - 1))) {

            return palindromo(palabra.substring(1, palabra.length() - 1));
        }

        return false;
    }
}
