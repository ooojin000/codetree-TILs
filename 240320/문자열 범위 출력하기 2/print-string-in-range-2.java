import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        int len = str.length();

        for(int i=len-1; i>len-n-1; i--) {
            System.out.print(str.charAt(i));
        }
    }
}