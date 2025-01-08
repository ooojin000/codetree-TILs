import java.util.*;

public class Main {
    public static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        F(n);
        System.out.print(cnt);
    }

    public static void F(int n) {
        if (n > 1) {
            cnt++;
            if (n % 2 == 0) {
                F(n / 2); 
            } else {
                F(n / 3);
            }
        }
    }
}