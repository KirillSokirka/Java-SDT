import java.util.Scanner;

public class Task2 {
    public static void Execute() {
        int initNumber = GetValuesFromUser();
        double root = FindSquareRootOfDigits(initNumber);
        System.out.printf("Квдратний корінь числа -> %f, Округлений результат - %d", root, Math.round(root));
    }

    private static int GetValuesFromUser() {
        int tempNumber = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введіть 3-ох значне ціле число -> ");
                tempNumber = Integer.parseInt(input.next());
                if (!CheckForThreeDigit(tempNumber)) {
                    throw new IllegalArgumentException();
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Введенні данні мають бути числом");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Введенне число має бути трьозначним");
            }
        }
        return tempNumber;
    }

    private static boolean CheckForThreeDigit(int number) {
        int count = 0;
        while((number % 10) != 0) {
            count++;
            number = number / 10;
        }
        return count == 3;
    }

    private static double FindSquareRootOfDigits(int number) {
        double X = 0;
        while((number % 10) != 0) {
            X += number % 10;
            number = number / 10;
        }
        return Math.sqrt(X);
    }
}
