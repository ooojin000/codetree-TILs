import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String ab = a + b;
        String ba = b + a;

        if(ab.equals(ba)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}