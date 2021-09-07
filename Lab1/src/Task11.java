import java.util.Scanner;

public class Task11 {
    public static void Execute() {
        int number = GetValueFromUser();
        System.out.println("Факторіал числа " + number + " дорівнює - " + CalculateFactorial(number));
    }

    private static int GetValueFromUser() {
        int tempNumber = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введіть ціле число -> ");
                tempNumber = Integer.parseInt(input.next());
                if (tempNumber <= 0)
                    throw new IllegalArgumentException();
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Введенні данні мають бути числом");
            } catch (IllegalArgumentException ex) {
                System.out.println("Введенне число має бути додатнім");
            }
        }
        return tempNumber;
    }

    private static int CalculateFactorial(int number) {
        if (number == 1)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }
}