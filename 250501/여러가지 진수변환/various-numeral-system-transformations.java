import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        if(b == 4) 
            quaternary(n);
        else
            octal(n);
    }

    public static void quaternary(int n) {
        System.out.print(Integer.toString(n, 4));
    }

    public static void octal(int n) {
        System.out.print(Integer.toString(n, 8));
    }
}