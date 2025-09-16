import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        boolean result = false;
        
        for (int i = 0; i < n1; i++) {
            if (a[i] == b[0]) {
                for (int j = 0; j < n2; j++) {
                    if (a[i + j] == b[j]) {
                        result = true;
                    } else {
                        result = false;
                    }
                }
            }
        }

        System.out.print(result == true ? "Yes" : "No");
    }
}