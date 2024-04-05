import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        int cnt = 0;
        int num = 1;

        for(int k = 0; k < m + n -1; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(i + j == cnt) {
                        arr[i][j] = num;
                        num++;
                    }
                }
            }
            cnt++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}