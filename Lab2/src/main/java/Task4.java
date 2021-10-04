/*
    Определите (в процентах от общего количества элементов), сколько элементов в массиве a имеют значение меньшее,
    чем среднее значение, сколько элементов – значение, равное среднему значению
    и сколько элементов имеют значение, большее, чем среднее значение.
*/

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void Execute () {
        int[] array = new int[0];
        array = FillTheArray(7);
        int average = FindAverage(array);
        System.out.println("Масив - " + Arrays.toString(array));
        System.out.print("Середнє значення - " + average);
        System.out.printf("\nВідсоток тих, що менше - %d%%", FindPercantage(array, average, "less"));
        System.out.printf("\nВідсоток тих, що більше - %d%%", FindPercantage(array, average, "more"));
    }

    private  static int[] FillTheArray(int numOfElements) {
        Random random = new Random();
        int[] tempArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            tempArray[i] = random.nextInt(25);
        }
        return tempArray;
    }

    public static int FindAverage(int[] array) {
        int average = 0;
        for (var elem: array) {
            average += elem;
        }
        return average / array.length;
    }

    public static int FindPercantage(int[] array, int average, String mode) {
        int count = 0;
        for (var element: array) {
            if(mode.equals("less")) {
                if(element < average)
                    count++;
            } else {
                if(element > average)
                    count++;
            }
        }
        return (100 * count) / array.length;
    }

}
