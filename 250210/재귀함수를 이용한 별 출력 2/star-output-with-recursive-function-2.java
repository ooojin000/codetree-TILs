import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printStar(n);
    }

    public static void printStar(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = n; j >= n - i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}