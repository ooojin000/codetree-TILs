import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();

        for(int i = 0; i < len + 1; i++) {
            System.out.println(str);
            str = str.substring(len - 1, len) + str.substring(0, len - 1);
        }
    }
}