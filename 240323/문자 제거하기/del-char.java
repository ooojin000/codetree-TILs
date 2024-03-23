import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[20];
        int cnt = 1;

        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
            
            if (str.length() >= arr[i]) {
                str = str.substring(0, arr[i]) + str.substring(arr[i] + 1);
                cnt++;
            } else {
                str = str.substring(0, str.length() - 1);
            }

            System.out.println(str);
        }
        
    }
}