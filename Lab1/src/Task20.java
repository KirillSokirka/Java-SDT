import java.util.Scanner;

public class Task20 {
    public static void Execute() {
        int initNumber = GetValuesFromUser();
        int changedNumber = ChangeNumber(initNumber);
        System.out.print("Початкове число -> " + initNumber
                + " \nЗмінене число -> " + changedNumber
                + " \nНатуральний логарифм числа -> " + Math.log(changedNumber));
    }

    private static int GetValuesFromUser() {
        int tempNumber = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введіть 4-ох значне ціле число -> ");
                tempNumber = Integer.parseInt(input.next());
                if (!CheckForFourDigit(tempNumber) || tempNumber < 0) {
                    throw new IllegalArgumentException();
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Введенні данні мають бути числом");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Введенне число має бути додатнім та 4-ьохзначним");
            }
        }
        return tempNumber;
    }

    private static boolean CheckForFourDigit(int number) {
        int count = 0;
        while((number % 10) != 0) {
            count++;
            number = number / 10;
        }
        return count == 4;
    }

    private static int ChangeNumber(int number) {
        String stringNumber = Integer.toString(number);
        String result = stringNumber.charAt(3) + stringNumber.substring(0,3);
        return Integer.parseInt(result);
    }
}
