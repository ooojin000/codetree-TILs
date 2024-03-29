import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        int len = str.length();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 1) {
                str = str.substring(1, len) + str.substring(0, 1);
                System.out.println(str);
            }

            if(arr[i] == 2) {
                str = str.substring(len - 1, len) + str.substring(0, len - 1);
                System.out.println(str);
            }

            if(arr[i] == 3) {
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                str = sb.toString();
                System.out.println(str);
            }
        }
    }
}