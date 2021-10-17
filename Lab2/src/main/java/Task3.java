/*
    Выведите на дисплей значения тех элементы массивов a и b, которые есть только в одном из массивов,
    и отсутствуют в другом массиве (предполагается, что и массив a и массив b являются множествами,
    т.е. каждый из них не содержит элементов с одинаковыми значениями).
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task3 {

    public static void Execute() {
        int[] firstArray = FillTheArray(5);
        int[] secondArray = FillTheArray(3);
        System.out.println("Перший массив -> " + Arrays.toString(firstArray));
        System.out.println("Другий массив -> " + Arrays.toString(secondArray));
        System.out.print("Унікальні значення -> " + Arrays.toString(FindOnlyUnique(firstArray, secondArray)));
    }

    private  static int[] FillTheArray(int numOfElements) {
        Random random = new Random();
        int[] tempArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            tempArray[i] = random.nextInt(20);
        }
        return tempArray;
    }

    public static Integer[] FindOnlyUnique(int[] firstArr, int[] secondArr) {
        var temp = new ArrayList<Integer>();
        IntStream.concat(Arrays.stream(firstArr), Arrays.stream(secondArr))
                .distinct()
                .filter(number -> !Contains(number, firstArr) || !Contains(number, secondArr))
                .forEach(temp::add);
        var tempArray = new Integer[temp.size()];
        return temp.toArray(tempArray);
    }

    private static boolean Contains(int number, int[] array) {
        for (var element : array) {
            if(element == number)
                return true;
        }
        return false;
    }
}
