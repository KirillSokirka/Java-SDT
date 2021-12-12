/*
Создать базовый класс
Дата (год, месяц, день)
и класс Дата со временем (Дата, часы, минуты).
 */
package Task36;

import java.util.Scanner;

public class Program {
    private enum Fields {
        Day,
        Month,
        Year,
        Minutes,
        Hours,
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        GlobalDate date = null;
        while (true) {
            String answer = null;
            while (true) {
                System.out.println("Choose what kind of date you want to create");
                System.out.println("\t1 - date without time");
                System.out.println("\t2 - date with time");
                System.out.print("Enter your answer: ");
                answer = scanner.nextLine();
                switch (answer) {
                    case "1" -> date = CreateDate();
                    case "2" -> date = CreateDateWithTime();
                    default -> {
                        System.out.println("You choice was incorrect try again");
                        continue;
                    }
                }
                break;
            }
            System.out.println("Date" + date.toString());
            System.out.println("To exit enter 'q', to continue something else: ");
            answer = scanner.nextLine();
            if (answer.equals("q"))
                break;
        }
    }

    private static DateWithTime CreateDateWithTime() {
        var date = new DateWithTime();
        getInformationFromUser(date, "day", Fields.Day);
        getInformationFromUser(date, "month", Fields.Month);
        getInformationFromUser(date, "year", Fields.Year);
        getInformationFromUser(date, "minutes", Fields.Minutes);
        getInformationFromUser(date, "hours", Fields.Hours);
        return date;
    }

    private static Date CreateDate() {
        var date = new Date();
        getInformationFromUser(date, "day", Fields.Day);
        getInformationFromUser(date, "month", Fields.Month);
        getInformationFromUser(date, "year", Fields.Year);
        return date;
    }

    private static void getInformationFromUser(GlobalDate date, String message, Fields field) {
        var scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Enter a %s: ", message);
                var answer = scanner.nextLine();
                switch (field) {
                    case Day -> date.setDay(Integer.parseInt(answer));
                    case Month -> date.setMonth(Integer.parseInt(answer));
                    case Year -> date.setYear(Integer.parseInt(answer));
                    case Minutes -> date.setMinutes(Integer.parseInt(answer));
                    case Hours -> date.setHours(Integer.parseInt(answer));
                }
            } catch (Exception e) {
                System.out.println("Some thing went wrong, try again ");
                continue;
            }
            break;
        }
    }
}
