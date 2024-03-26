import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        String[] arr = new String[n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if(str.equals(arr[i])) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}