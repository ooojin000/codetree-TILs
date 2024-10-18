import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        getLCM(n, m);
    }

    public static void getLCM(int n, int m) {
        int gcdNum = 0;

        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcdNum = i;
            }
        }

        int num = n * m / gcdNum;

        System.out.print(num);
    }
}