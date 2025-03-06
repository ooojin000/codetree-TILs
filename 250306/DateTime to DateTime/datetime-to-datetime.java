import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int elapsedMin = 0;

        if(A >= 11 && B >= 11 && C >= 11) {
            System.out.print((A - 11) * 24 * 60 + (B - 11) * 60 + (C - 11)); 
        } else {
            System.out.print(-1);
        }
    }
}