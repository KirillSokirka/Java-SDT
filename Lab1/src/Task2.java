import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        int initNumber = GetValuesFromUser();
        double root = FindSquareRootOfDigits(initNumber);
        System.out.printf("Square root of number -> %f, Rounded result - %d", root, Math.round(root));
    }

    private static int GetValuesFromUser() {
        int tempNumber = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter three-digit number -> ");
                tempNumber = Integer.parseInt(input.next());
                if (!CheckForThreeDigit(tempNumber)) {
                    throw new IllegalArgumentException();
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("The entered data must be number");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("The entered number must consist of 3 digit");
            }
        }
        input.close();
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
