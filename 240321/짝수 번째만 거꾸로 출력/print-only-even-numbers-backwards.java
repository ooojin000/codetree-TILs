import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length() - 1;

        for(int i=len; i>=0; i-=2) {
            if(len%2 == 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}