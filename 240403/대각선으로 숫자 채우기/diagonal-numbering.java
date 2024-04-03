import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i - j][j] = num++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                arr[arr.length - 1 - j][i + j] = num++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}