import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 1) {
            System.out.print(odd(n));
        } else {
            System.out.print(even(n));
        }
        
    }

    public static int odd(int n) {
        if(n == 1) {
            return 1;
        }
        return odd(n - 2) + n;
    }

    public static int even(int n) {
        if(n == 2) {
            return 2;
        }
        return even(n - 2) + n;
    }
}