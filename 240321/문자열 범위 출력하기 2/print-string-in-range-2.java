import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int length = str.length();
        
        int n = sc.nextInt();

        if (n > length) {
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }        
        } else {
            for (int i = length - 1; i >= length - n; i--) {
                System.out.print(str.charAt(i));
            }
        }        
    }
}