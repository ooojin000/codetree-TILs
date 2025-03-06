import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int dateTime1 = 11 * 24 * 60 + 11 * 60 + 11;

        int dateTime2 = A * 24 * 60 + B * 60 + C;

        if(dateTime1 < dateTime2) {
            System.out.print(dateTime2 - dateTime1);
        } else {
            System.out.print(-1);
        }
    }
}