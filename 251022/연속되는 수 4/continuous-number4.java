import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int cnt = 1;
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int k = ++cnt;
                if (max < k) {
                    max = k;
                }
            } else {
                cnt = 1;
            }
        }

        System.out.print(max);
    }
}