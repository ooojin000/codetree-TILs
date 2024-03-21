import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        String sum = "";

        for(int i=0; i<n; i++) {
            str[i] = sc.next();
            sum += str[i];
        }

        System.out.print(sum);
    }
}