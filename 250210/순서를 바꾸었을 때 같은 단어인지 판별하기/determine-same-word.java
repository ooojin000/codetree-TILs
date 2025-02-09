import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);

        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);

        boolean result = true;

        if(str1.length() == str2.length()) {
            for(int i = 0; i < str1.length(); i++) {
                if(chars1[i] != chars2[i]) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        
        

        if(result) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}