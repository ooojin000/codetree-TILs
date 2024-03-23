import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        int a = (int)c;

        if (c == 'a') {
            System.out.print("z");
        } else {
           System.out.print((char)(a - 1)); 
        }
    }
}