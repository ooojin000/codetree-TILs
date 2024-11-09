import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        month(m, d);
    }

    public static void month(int m, int d) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d >= 1 && d <= 31) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d >= 1 && d <= 30) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        } else if (m == 2) {
            if (d >= 1 && d <= 28) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        } else {
            System.out.print("No");
        }
    }
}