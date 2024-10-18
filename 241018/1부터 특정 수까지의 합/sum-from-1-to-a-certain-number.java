import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int totalNum = sum(n);
        System.out.print(totalNum / 10);
    }

    public static int sum(int a) {
        int sum = 0;

        for(int i = 1; i <= a; i++) {
            sum += i;
        }

        return sum;
    }
}