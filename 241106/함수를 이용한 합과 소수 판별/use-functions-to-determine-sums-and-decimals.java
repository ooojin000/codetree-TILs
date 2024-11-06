import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(isPrime(i) == true) 
                if(isEven(i) == true)
                    cnt++;
        }
        System.out.print(cnt);
    }

    public static boolean isPrime(int i) {
        boolean result = true;

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean isEven(int i) {
        boolean result = false;
        int num = (i / 10) + (i % 10);
        if(num % 2 == 0)
            result = true;
        return result;
    }
}