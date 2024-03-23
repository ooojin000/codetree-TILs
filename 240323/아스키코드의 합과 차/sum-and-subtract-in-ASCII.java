import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int aa = (int)a;
        int bb = (int)b;

        int plus = aa + bb;
        int minus = 0;

        if(aa > bb) {
            minus = aa - bb;
        } else {
            minus = bb - aa;
        }

        System.out.print(plus + " " + minus);
    }
}