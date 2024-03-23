import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        int a = (int)c;

        if(c == 'z') {
            System.out.print("a");
        } else {
            char b = (char)(a + 1);
            System.out.print(b);
        }
    }
}