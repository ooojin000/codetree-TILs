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
            int cnt = 0;

            while(arr[i] > 1) {
                if(arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    cnt++;
                } else {
                    arr[i] = arr[i] * 3 + 1;
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
        
    }
}