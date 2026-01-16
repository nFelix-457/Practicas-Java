/**
 * Author: nFelix-457
 * Date: 22/02/2022
 * Description: Clase Main principal
 */

void main() {

    BubbleSort bs = new BubbleSort();

    /**********************************/

    int[] numbers = {5, 2, 9, 1, 3, 22};
    bs.bubbleSortNumbers(numbers);

    for (int n : numbers) {
        System.out.print(n + " | ");
    }
    /**********************************/
    System.out.println("\n");
    /**********************************/

    String[] names = {"Felix", "Ana", "Roberto", "Carlos", "Bernardo"};
    bs.bubbleSortStrings(names);

    for (String s : names) {
        System.out.print(s + " | ");
    }
}
