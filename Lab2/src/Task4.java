import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void Execute () {
        int[] array = new int[0];
        array = FillTheArray(7);
        int avarege = FindAvarage(array);
        System.out.println("Масив - " + Arrays.toString(array));
        System.out.print("Середнє значення - " + avarege);
        System.out.printf("\nВідсоток тих, що менше - %d%%", FindPercantage(array, avarege, "less"));
        System.out.printf("\nВідсоток тих, що більше - %d%%", FindPercantage(array, avarege, "more"));
    }

    private  static int[] FillTheArray(int numOfElements) {
        Random random = new Random();
        int[] tempArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            tempArray[i] = random.nextInt(25);
        }
        return tempArray;
    }

    private static int FindAvarage(int[] array) {
        int avarage = 0;
        for (var elem: array) {
            avarage += elem;
        }
        return avarage / array.length;
    }

    private static int FindPercantage(int[] array, int avarage, String mode) {
        int count = 0;
        for (var element: array) {
            if(mode == "less") {
                if(element < avarage)
                    count++;
            } else {
                if(element > avarage)
                    count++;
            }
        }
        return (100 * count) / array.length;
    }

}
