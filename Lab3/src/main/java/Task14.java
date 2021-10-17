/*
Создайте программу, которая осуществляет шифрование / расшифровка методом гаммирования.
В нем ключом является текстовая строка такой же длины, как и открытый текст, а шифрование /
расшифровка заключается в суммировании / вычитании кодов символов открытого текста /
криптотексте с кодами символов ключа.
*/
import java.util.Random;

public class Task14 {

    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234569";

    public static void Execute() {
        var text = "Some";
        var random = new Random(123);
        var key = GenerateGamma(text, random);
        var result = EncryptText(text, key);
        System.out.printf("Encrypted text -> %s\n", result);
        System.out.printf("Decrypted text -> %s", DecryptText(result, key));
    }

    public static String GenerateGamma(String text, Random random) {
        var key = new StringBuffer(text.length());
        for (int i = 0; i < text.length(); i++) {
            key.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return key.toString();
    }

    public static String EncryptText(String text, String key) {
        var encryptedText = new StringBuffer(text.length());
        for (int i = 0; i < text.length(); i++) {
            if (alphabet.indexOf(text.charAt(i)) == -1) {
                encryptedText.append(text.charAt(i));
                continue;
            }
            encryptedText.append(alphabet.charAt((alphabet.indexOf(text.charAt(i)) +
                    alphabet.indexOf(key.charAt(i))) % alphabet.length()));
        }
        return encryptedText.toString();
    }

    public static String DecryptText(String text, String key) {
        var decryptedText = new StringBuffer(text.length());
        for (int i =0; i < text.length(); i++) {
            if (alphabet.indexOf(text.charAt(i)) == -1) {
                decryptedText.append(text.charAt(i));
                continue;
            }
            decryptedText.append(alphabet.charAt((alphabet.indexOf(text.charAt(i)) + alphabet.length()
                    - alphabet.indexOf(key.charAt(i))) % alphabet.length()));
        }
        return decryptedText.toString();
    }
}
