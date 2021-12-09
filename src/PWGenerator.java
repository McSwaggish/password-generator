import java.util.*;

public class PWGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of random password: ");
        System.out.println(password(sc.nextInt()));
        sc.close();
    }
    private static char[] password(int length) {
        char[] fPassword = new char[length];

        String capsLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letters     = "abcdefghijklmnopqrstuvwxyz";
        String digits      = "0123456789";
        String characters  = "!#¤%&/()=?@£$€{[]}\\,.-;:_*^~<>|";

        String allowedChars = capsLetters + letters + digits + characters;
        Random rand = new Random();

        for(int i = 0; i < length; i++) {
            fPassword[i] = allowedChars.charAt(rand.nextInt(allowedChars.length()));
        }

        return fPassword;
    }
}