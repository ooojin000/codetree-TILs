import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRect(n);
    }

    public static void printRect(int n) {
        int num = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(num++ + " ");
                if(num == 10) {
                    num = 1;    
                }
            }
            System.out.println();
        }
    }
}