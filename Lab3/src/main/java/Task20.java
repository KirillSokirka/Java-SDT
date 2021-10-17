/*
Анализ типов аргументов, задаваемых при запуске программы. Если аргумент является целым шестнадцатеричным числом
(шаблон: состоит из цифр от 0 до 9 и букв A(a), B(b), C(c), D(d), E(e),F(f), перед числом должны стоять символы "0X" или "0x"),
то  тип аргумента "Hexadecimal", иначе "String"
Программа выводит количество заданных аргументов и, для каждого аргумента, его тип и значение.
*/
import java.util.regex.Pattern;

public class Task20 {
    public static void Execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Invalid arguments");
            return;
        }
        String[] results = AnalyseArguments(args);
        for (var item: results) {
            System.out.println(item);
        }
    }

    public static String[] AnalyseArguments(String[] args) {
        var result = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            if (Pattern.matches("0X|0x[0-9A-Fa-f]+", args[i])) {
                result[i] = "Hexadecimal ".concat(args[i]);
            } else {
                result[i] = "String ".concat(args[i]);
            }
        }
        return result;
    }
}
