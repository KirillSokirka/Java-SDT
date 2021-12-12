/*
Создать класс Треугольник. Поля - стороны.
Функции-члены вычисляют площадь, периметр, устанавливает поля и возвращают значения.
Функции-члены установки полей класса должны проверять корректность задаваемых параметров.
 */
package Task14;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, to rectangle calculator\nTo calculate area and perimeter firstly enter width " +
                "and height");
        do {
            var triangle = getTriangleBasedOnUserInput();
            System.out.println("""
                    Now it's time to calculate ->
                    \tEnter 1, to calculate area
                    \tEnter 2, to calculate perimeter""");
            int answer = getUserChoice();
            System.out.println("Triangle -> " + triangle.toString());
            switch (answer) {
                case 1 -> System.out.println("Triangle area -> " + triangle.calculateArea());
                case 2 -> System.out.println("Triangle perimeter -> " + triangle.calculatePerimeter());
            }
            System.out.println("Do u wanna to calculate more?\nIf yes enter 1, else everything that u want");
            try {
                var scanner = new Scanner(System.in);
                var temp = scanner.nextLine();
                if (!temp.equals("1"))
                    break;
            } catch (Exception e) {
                System.out.println("During entering data something went wrong");
            }
        } while (true);
    }

    private static Triangle getTriangleBasedOnUserInput() {
        var scanner = new Scanner(System.in);
        var triangle = new Triangle();
        do {
            try {
                System.out.print("Enter first side -> ");
                triangle.setA(Double.parseDouble(scanner.nextLine()));
                System.out.print("Enter second side -> ");
                triangle.setB(Double.parseDouble(scanner.nextLine()));
                System.out.print("Enter second side -> ");
                triangle.setC(Double.parseDouble(scanner.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("During data entering something went wrong try again");
            }
        } while (true);
        return triangle;
    }

    private static int getUserChoice() {
        var scanner = new Scanner(System.in);
        int answer = 0;
        do {
            System.out.print("Your choice -> ");
            try {
                var temp = scanner.nextLine();
                answer = Integer.parseInt(temp);
            } catch (Exception e) {
                System.out.println("During data entering something went wrong try again: ");
            }
            if (!(answer == 1 || answer== 2)) {
                System.out.println("You choose illegal option, try again");
            }
        } while (!(answer == 1 || answer == 2));
        return answer;
    }
}
