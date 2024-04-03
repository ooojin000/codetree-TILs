import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char a = str.charAt(0);
        char b = str.charAt(1);

        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == b) {
                str2.append(a);
            } else {
                str2.append(str.charAt(i));
            }
        }

        System.out.print(str2);
    }
}