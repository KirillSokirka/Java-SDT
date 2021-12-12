/*"""
Создать класс типа Прямоугольник. Поля - высота и ширина.
Функции-члены вычисляют площадь, периметр, устанавливает поля и возвращают значения.
Функции-члены установки полей класса должны проверять корректность задаваемых параметров.
"""*/
package Task10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var rectangle = new Rectangle();
        var scanner = new Scanner(System.in);
        System.out.println("Hello, to rectangle calculator\nTo calculate area and perimeter firstly enter width " +
                "and height");
        do {
            do {
                try {
                    System.out.print("Enter width -> ");
                    var temp = scanner.nextLine();
                    rectangle.setWidth(Double.parseDouble(temp));
                    System.out.print("Enter height -> ");
                    temp = scanner.nextLine();
                    rectangle.setHeight(Double.parseDouble(temp));
                } catch (Exception e) {
                    System.out.println("During data entering something went wrong try again");
                }
            } while (!(rectangle.getHeight() > 0 && rectangle.getWidth() > 0));
            System.out.println("""
                    Now it's time to calculate ->
                    \tEnter 1, to calculate area
                    \tEnter 2, to calculate perimeter""");
            int answer = getUserChoice();
            switch (answer) {
                case 1 -> System.out.println("Task10.Rectangle area -> " + rectangle.calculateArea());
                case 2 -> System.out.println("Task10.Rectangle perimeter -> " + rectangle.calculatePerimeter());
            }
            System.out.println("Do u wanna to calculate more?\nIf yes enter 1, else everything that u want");
            try {
                var temp = scanner.nextLine();
                if (!temp.equals("1"))
                    break;
            } catch (Exception e) {
                System.out.println("During entering data something went wrong");
            }
        } while (true);
        scanner.close();
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
