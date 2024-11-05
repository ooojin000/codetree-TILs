import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (onjeonsu(i) == true) {
                cnt++;
            }
        }

        System.out.print(cnt);
        
    }

    public static boolean onjeonsu(int i) {
        boolean result = false;
        if (i % 2 == 0) {
            result = false;
        } else if (i % 10 == 5) {
            result = false;
        } else if (i % 3 == 0 && i % 9 != 0) {
            result = false;
        } else {
            result = true;
        }

        return result;
    }
}