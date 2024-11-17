import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        modify(str, reverse);
    }

    public static void modify(String str, String reverse) {
        if (str.equals(reverse)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}