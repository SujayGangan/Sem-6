import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class CaesarCipher {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str = "kitkolhapury";
        System.out.println("Encrypted text is : " + caesarCipher(str));
        // File file = new File("test.txt");
        // Scanner Reader = new Scanner(file);
        // String data = "";
        // while (Reader.hasNextLine()) {
        //     data = Reader.nextLine();
        //     System.out.println(data);
        // }
        // System.out.println("Encrypted text is : " + caesarCipher(data));
        // Reader.close();
    }

    public static String caesarCipher(String str) {
        String toReplace = "abcdefghijklmnopqrstuvwxyz";
        String encryptedText = "";
        for (int i = 0; i < str.length(); i++) {
            int key = 5;
            int placeValue = toReplace.indexOf(str.charAt(i));
            int replaceValue = (key + placeValue) % 26;
            encryptedText += toReplace.charAt(replaceValue);
        }
        return encryptedText;
    }
}
