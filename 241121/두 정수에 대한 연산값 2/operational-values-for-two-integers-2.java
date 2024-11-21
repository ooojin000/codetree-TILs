import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        modify(a, b);
    }

    public static void modify(int a, int b) {
        if (a < b) {
            a += 10;
            b *= 2;
        } else {
            a *= 2;
            b += 10;
        }

        System.out.print(a + " " + b);
    }
}