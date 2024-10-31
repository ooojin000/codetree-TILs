import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHelloWord(n);
    }
    
    public static void printHelloWord(int n) {
        if (n == 0)
            return;
        
        printHelloWord(n - 1);
        System.out.println("HelloWorld");
    }
}