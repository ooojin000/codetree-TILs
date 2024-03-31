import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int cnt = 0;
        int len1 = str1.length();
        int len2 = str2.length();

        int n = -1;

        for(int i = 0; i < len1; i++) {
            str1 = str1.substring(len1 - 1, len1) + str1.substring(0, len1 - 1);
            cnt++;
            if(str1.equals(str2)) {
                n = cnt;
                break;
            } 
        }

        System.out.print(n);

    }
}