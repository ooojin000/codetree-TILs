import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();

        boolean result = false;

        int cnt = 0;
        
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0))
            result = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            if (result) {
                cnt = i;
                break;
            }
        }

        System.out.print(result == true ? cnt : -1);
    }
}