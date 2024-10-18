import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        getGCD(n, m);
    }

    public static void getGCD(int n, int m) {
        int maxNum = 0;
        
        for(int i = 1; i <= n && i <= m; i++) {
            if(n % i == 0 && m % i == 0) {
                maxNum = i;
            }
        }

        System.out.print(maxNum);
    }
}