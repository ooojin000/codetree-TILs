import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String ab = a + b;
        String ba = b + a;

        int aInt = Integer.parseInt(ab) + Integer.parseInt(ba);

        System.out.print(aInt);
    }
}