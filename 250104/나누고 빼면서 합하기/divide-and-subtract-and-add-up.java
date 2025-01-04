import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        while (m > 1) {
            sum += arr[m];
            if (m % 2 == 1) {
                m -= 1;
                sum += arr[m];
            } else {
                m /= 2;
                sum += arr[m];
            }
        }

        System.out.print(sum);
    }
}