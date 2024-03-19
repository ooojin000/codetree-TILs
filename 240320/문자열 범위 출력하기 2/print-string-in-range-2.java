import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        int len = str.length()-1;

        for(int i=len; i>len-n; i--) {
            System.out.print(str.charAt(i));
        }
    }
}