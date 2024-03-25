import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String lrStr = sc.next();

        int len = str.length();

        for(int i = 0; i < lrStr.length(); i++) {
            if(lrStr.charAt(i) == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            }
            if(lrStr.charAt(i) == 'R') {
                str = str.substring(len - 1) + str.substring(0, len - 1);
            }
        }

        System.out.print(str);
    }
}