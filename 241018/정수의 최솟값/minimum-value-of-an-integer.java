import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        int d = Math.min(a, b);
        int e = Math.min(c, d);

        return e;
    } 
}