import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];

        for(int i = 0; i < n; i++) {
            arr[sc.nextInt() - 1]++;
        }

        int max = 0;

        for(int i = 0; i < 1000; i++) {
            if(arr[i] == 1 && (i + 1) > max) {
                max = i + 1;
            }
        }

        if(max == 0) {
            System.out.print(-1);
        } else {
            System.out.print(max);
        }

        
    }
}