import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 80) {
            System.out.print("pass");
        } else {
            System.out.print((80 - n) + " more score");
        }
    }
}