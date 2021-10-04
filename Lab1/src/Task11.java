import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int number = GetValueFromUser();
        System.out.println("Factorial of the number " + number + " equals - " + CalculateFactorial(number));
    }

    private static int GetValueFromUser() {
        int tempNumber = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a integer -> ");
                tempNumber = Integer.parseInt(input.next());
                if (tempNumber < 0)
                    throw new IllegalArgumentException();
                break;
            } catch (NumberFormatException ex) {
                System.out.println("The entered data must be integer");
            } catch (IllegalArgumentException ex) {
                System.out.println("The entered number must be positive or zero");
            }
        }
        input.close();
        return tempNumber;
    }

    private static int CalculateFactorial(int number) {
        if (number == 1 || number == 0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }
}