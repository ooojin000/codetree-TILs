import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String toStr = "";

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
            toStr += arr[i];
        }

        char[] a = toStr.toCharArray();

        int cnt = 0;

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if((i + 1) % 5 == 0){
                System.out.println();
            }
        }
    }
}