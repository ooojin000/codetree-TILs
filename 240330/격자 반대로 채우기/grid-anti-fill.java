import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int num = 1;
        
        for(int j = 0; j < n; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < n; i++) {
                    arr[j][i] = num;
                    num++;
                }
            } else {
                for(int i = n - 1; i >= 0; i--) {
                    arr[j][i] = num;
                    num++;
                }
            }
        }

        for(int i = n - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}