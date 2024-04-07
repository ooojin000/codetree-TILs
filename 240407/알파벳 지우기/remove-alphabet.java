import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        int len1 = str1.length();
        int len2 = str2.length();

        String str3 = "";
        String str4 = "";
        
        for(int i = 0; i < len1; i++) {
            if(str1.charAt(i) >= '0' && str1.charAt(i) <='9') {
                str3 += str1.charAt(i);
            }
        }

        for(int i = 0; i < len2; i++) {
            if(str2.charAt(i) >= '0' && str2.charAt(i) <='9') {
                str4 += str2.charAt(i);
            }
        }

        int sum = Integer.parseInt(str3) + Integer.parseInt(str4);

        System.out.print(sum);

    }
}