import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] sum = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i] += a[j] * Math.abs(j - i);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (min > sum[i]) {
                min = sum[i];
            }
        }

        System.out.print(min);
    }
}