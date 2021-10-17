/*
Анализ аргументов, задаваемых при запуске программы. Программа удаляет из массива
введенных аргументов все повторяющиеся аргументы,
кроме одного (например, из аргументов "ab", "cd", "ab" будут оставлены аргументы "ab" и "cd").
Шаблон аргумента: строка латинских букв.
Программа выводит количество заданных аргументов, их значения, а также количество разных аргументов и их значения.
*/
import java.util.ArrayList;

public class Task36 {
    public static void Execute(String[] args) {
        System.out.printf("The unfiltered args contains %d arguments\n", args.length);
        System.out.println("Three are:");
        for (var item : args) {
            System.out.printf("%s ", item);
        }
        var filteredArguments = FilterArguments(args);
        System.out.printf("\nThe filtered args contains %d arguments\n", filteredArguments.length);
        System.out.println("Three are:");
        for (var item : filteredArguments) {
            System.out.printf("%s ", item);
        }
    }

    public static String[] FilterArguments(String[] args) {
        var temp = new ArrayList<String>();
        for (var argument: args) {
            if (temp.contains(argument)) {
                continue;
            }
            temp.add(argument);
        }
        return temp.toArray(new String[0]);
    }
}
