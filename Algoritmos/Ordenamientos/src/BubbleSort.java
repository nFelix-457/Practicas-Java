/**
 * Author: nFelix-457
 * Date: 22/02/2022
 * Description: La clase {@code BubbleSort} genera un metodo de ordenamiento de tipo burbuja el cual ordena
 * arreglos de datos.
 */
public class BubbleSort {

    /**
     * Ordena un arreglo de enteros
     **/
    public static void bubbleSortNumbers(int[] array) {
        int n = array.length;
        boolean swapped;

        // Repite el for hasta que no queden cambios
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Recorre el array comparando elementos
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambia elementos para que se ordenen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }


    /**
     * Ordena un arreglo de Strings en orden alfabético
     */
    public static void bubbleSortStrings(String[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // compareTo retorna > 0 si array[j] > array[j+1]
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


}
