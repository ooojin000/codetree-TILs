import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int cnt = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int tmp = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == 2) {
                tmp = i;
                cnt++;
                if(cnt == 3) {
                    break;
                }
            }
        }

        System.out.print(tmp+1);
    }
}