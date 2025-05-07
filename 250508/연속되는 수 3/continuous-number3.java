import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int cnt = 1;
        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0)
                cnt++;
            else if (arr[i] < 0 && arr[i + 1] < 0)
                cnt++;
            
            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}