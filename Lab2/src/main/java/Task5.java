/*
    Сформировать массив b, элементами которого являются элементы исходного
    одномерного массива a, расположенные в обратном порядке.
*/

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void Execute() {
        int[] array = new int[0];
        array = FillTheArray(5);
        int[] resultArray = Reverse(array);
        System.out.printf("Початковий масив -> %s \nЗмінений масив -> %s", Arrays.toString(array), Arrays.toString(resultArray));
    }

    private  static int[] FillTheArray(int numOfElements) {
        Random random = new Random();
        int[] tempArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            tempArray[i] = random.nextInt(25);
        }
        return tempArray;
    }

    public static int[] Reverse(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[array.length - 1 - i];
        }
        return tempArray;
    }
 }
