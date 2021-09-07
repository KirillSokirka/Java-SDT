import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task3 {
    public static void Execute() {
        int[] firstArray = new int[0];
        int[] secondArray = new int[0] ;
        firstArray = FillTheArray(5);
        secondArray = FillTheArray(3);
        System.out.println("Перший массив -> " + Arrays.toString(firstArray));
        System.out.println("Другий массив -> " + Arrays.toString(secondArray));
        System.out.print("Унікальні значення -> ");
        ShowOnlyUnique(firstArray, secondArray);
    }

    private  static int[] FillTheArray(int numOfElements) {
        Random random = new Random();
        int[] tempArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            tempArray[i] = random.nextInt(25);
        }
        return tempArray;
    }

    private static void ShowOnlyUnique(int[] firstArr, int[] secondArr) {
        IntStream.concat(Arrays.stream(firstArr), Arrays.stream(secondArr))
                .distinct()
                .filter(number -> !Contains(number, firstArr) || !Contains(number, secondArr))
                .forEach(num -> System.out.print(num + " "));
    }

    private static boolean Contains(int number, int[] array) {
        for (var element : array) {
            if(element == number)
                return true;
        }
        return false;
    }

}
