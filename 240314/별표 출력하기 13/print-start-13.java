import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int plus = 1;
        int minus = n;

        for(int i=0; i<n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        int i = 0;
        while(i != n) {
            for(i=0; i<plus; i++) {
                System.out.print("* ");
            }
            plus++;
            System.out.println();

            for(int j=minus-1; j>0; j--) {
                System.out.print("* ");
            }
            minus--;
            System.out.println();
        }
    }
}