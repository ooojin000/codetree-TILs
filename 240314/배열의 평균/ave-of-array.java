import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        double total = 0;

        for(int i=0; i<2; i++) {
            double width = 0;
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
                width += arr[i][j];
                total += arr[i][j];
            }
            System.out.printf("%.1f ", width/4);
        }

        System.out.println();

        for(int i=0; i<4; i++) {
            double height = 0;
            for(int j=0; j<2; j++) {
                height += arr[j][i];
            }
            System.out.printf("%.1f ", height/2);
        }

        System.out.println();
        System.out.printf("%.1f ", total/8);
    }
}