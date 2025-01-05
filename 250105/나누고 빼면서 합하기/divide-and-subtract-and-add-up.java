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

        System.out.print(calc(arr, m));
    }

    public static int calc (int[] arr, int m) {
        int sum = 0;

        while (m > 0) {
            sum += arr[m - 1];
            if (m % 2 == 1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        return sum;
    }
}