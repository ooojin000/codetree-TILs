import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        magicNumber(n);

        if(magicNumber(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean magicNumber(int n) {
        int m = (n / 10) + (n % 10); 
        return n % 2 == 0 && m % 5 == 0;
    }
}