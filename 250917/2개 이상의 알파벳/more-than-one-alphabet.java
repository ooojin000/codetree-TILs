import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        cal(A);
    }

    public static void cal (String a) {
        int cnt = 1;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                cnt++;
            }
        }

        System.out.print(cnt >= 2 ? "Yes" : "No");
    }
}