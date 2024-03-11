import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[10];

        while(a > 1) {
            int n = a %b;
            arr[n]++;
            a /= b;
        }

        int result = 0;

        for(int i=0; i<10; i++) {
            result += arr[i] * arr[i];
        }

        System.out.print(result);

    }
}