
package DataBase;

import java.util.Arrays;

/**
 *
 * @author Felix Navarro
 */
public class Logic {

    boolean siGano = false;

    public static boolean siGano(char[] palabra, char[] vector, int indice) {
        if (indice == vector.length) {
            return true;
        } else if (palabra[indice] != vector[indice]) {
            return false;
        } else {
            return siGano(palabra, vector, indice + 1);
        }
    }

    public static boolean siGano2(char[] vector, char palabra, int pos) {
        if (palabra == (vector[pos])) {
            return true;
        } else if (palabra != vector[pos]) {
            return false;
        } else {
            return siGano2(vector, palabra, pos + 1);
        }
    }

    public static boolean siGano3(char[] palabra, char[] vector) {
        if(Arrays.equals(palabra, vector)){
            return true;
        }else{
            return false;
        }
    }
}
