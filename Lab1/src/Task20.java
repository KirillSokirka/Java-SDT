import java.util.Scanner;

public class Task20 {
    public static void main(String args[]) {
        int initNumber = GetValuesFromUser();
        int changedNumber = ChangeNumber(initNumber);
        System.out.print("The init number -> " + initNumber
                + " \nThe changed number -> " + changedNumber
                + " \nNumber`s ln -> " + Math.log(changedNumber));
    }

    private static int GetValuesFromUser() {
        int tempNumber = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter 4-digit integer -> ");
                tempNumber = Integer.parseInt(input.next());
                if (!CheckForFourDigit(tempNumber) || tempNumber < 0) {
                    throw new IllegalArgumentException();
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Entered data must be number");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("The entered data must be positive and consist of 4 digit");
            }
        }
        input.close();
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
