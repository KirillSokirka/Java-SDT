/*
Создайте программу для определения количества вхождений указанного символа в заданном тексте.
Работа программы прекращается после введения символа "-".
*/
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task10 {
    public  static void Execute() {
        var reader = new Scanner(System.in);
        do {
            var text = GetTextFromUser(reader);
            var character = GetCharacterFromUser(reader);
            var count = CountNumberOfMatches(text, character);
            System.out.printf("Number of matches -> %d\n", count);
            System.out.print("If u want to exit enter \"-\" -> ");
        } while (!reader.next().equals("-"));
        reader.close();
        System.out.println("Have a nice day!");
    }

    public static String GetTextFromUser(Scanner reader) {
        System.out.print("Enter the text: ");
        return reader.nextLine();
    }

    public static String GetCharacterFromUser(Scanner reader) {
        System.out.print("Enter a character which u want to find: ");
        return reader.next();
    }

    public static int CountNumberOfMatches(String text, String character) {
        var pattern = Pattern.compile(character);
        var matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
