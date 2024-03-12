import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int minVal = INT_MAX;
        int cnt = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(minVal > arr[i]) {
                minVal = arr[i];
            }
        }

        for(int i=0; i<n; i++) {
            if(arr[i] == minVal) {
                cnt++;
            }
        }

        System.out.print(minVal + " " + cnt);
    }
}