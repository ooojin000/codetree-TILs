import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n - i; j++) {
                if(arr[i] == arr[i + j]) {
                    arr[i] = 0;
                    arr[i + j] = 0;
                }
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        if(max > 0) {
            System.out.print(max);
        } else {
            System.out.print("-1");
        }

        
    }
}