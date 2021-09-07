import java.util.*;

public class Task2 {
    public  static void Execute() {
        int min = 0;
        int max = 0;
        int[] numbers = new int[0];
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Введіть нижню та верхню границі проміжку та елементи масиву -> ");
            try {
                String[] tempArray = in.nextLine().split(" ");
                min = Integer.parseInt(tempArray[0]);
                max = Integer.parseInt(tempArray[1]);
                if(min > max)
                {
                    int temp = max;
                    max = min;
                    min = temp;
                }
                numbers = new int[tempArray.length-2];
                for (int i = 2; i < tempArray.length; i++) {
                    numbers[i-2] =Integer.parseInt(tempArray[i]);
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Вхідний рядок повинен містити лише цифри!");
            }
        }
        Map<Integer, Integer> resultNumbers = FilterArray(min, max, numbers);
        System.out.printf("Нижня межа: %d | Верхня межа: %d \n", min, max);
        for (var number : resultNumbers.entrySet()) {
            System.out.printf("Індекс %d | Значення %d \n", number.getKey(), number.getValue());
        }
    }

    private static Map<Integer, Integer> FilterArray(int min, int max, int[] numbers)  {
        Map<Integer, Integer> resultNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min || numbers[i] > max)
                resultNumbers.put(i, numbers[i]);
        }
        return resultNumbers;
    }
}
