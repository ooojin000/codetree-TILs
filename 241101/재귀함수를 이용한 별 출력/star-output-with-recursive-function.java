import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }

    public static void printStar(int n) {
        if (n == 0)
            return;

        printStar(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}