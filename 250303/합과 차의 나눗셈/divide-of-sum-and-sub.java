import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = a + b;
        float d = a - b;

        System.out.printf("%.2f", c / d);
    }
}