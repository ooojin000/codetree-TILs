import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = a * b * c;

        System.out.print(F(n));
    }

    public static int F(int n) {
        if(n < 10) {
            return n;
        }
        
        return F(n / 10) + (n % 10);
    }
}