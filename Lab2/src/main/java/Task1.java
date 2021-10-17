/*
    Сформировать одномерный массив b из исходного  одномерного массива a путем циклического
    сдвига элементов a на k  позиций вправо. Значение k задается как первый аргумент
    при вызове программы, остальные аргументы – элементы массива.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void Execute() {

        System.out.print("Введіть кількість позицій для зсуву та елементи початковго масиву -> ");
        int k = 0;
        int[] numbers = new int[0];
        Scanner in = new Scanner(System.in);
        try {
            String[] tempArray =  in.nextLine().split(" ");
            k = Integer.parseInt(tempArray[0]);
            numbers = new int[tempArray.length-1];
            for (int i = 1; i < tempArray.length; i++) {
                numbers[i-1] =Integer.parseInt(tempArray[i]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Вхідний рядок повинен містити лише цифри");
        }

        System.out.print("Початковий масив: " + Arrays.toString(numbers));
        int[] resultNumbers = Transform(k, numbers);
        System.out.print("\nЗмінений масив: " + Arrays.toString(resultNumbers));
    }

    public static int[] Transform(int k, int[] numbers) {
        int[] resultNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (i+k >= resultNumbers.length && i == 0) {
                while(k >= resultNumbers.length)
                    k = k - resultNumbers.length;
            } else if (i+k >= resultNumbers.length) {
                k = -i;
            }
            resultNumbers[i+k] = numbers[i];
        }
        return resultNumbers;
    }
}
