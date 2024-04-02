import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == max) {
                cnt++;
            }
        }

        if(cnt == 1) {
            System.out.print(max);
        } else {
            System.out.print("-1");
        }
        
    }
}