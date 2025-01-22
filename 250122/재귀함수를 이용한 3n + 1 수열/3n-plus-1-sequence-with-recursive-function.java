import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(F(n));
    }

    public static int F(int n) {
        int cnt = 0;

        while (n > 1) {
            if(n % 2 == 0) {
                n /= 2;
                cnt++;
            } else {
                n = n * 3 + 1;
                cnt++;
            }
        }
        
        return cnt;
    }
}