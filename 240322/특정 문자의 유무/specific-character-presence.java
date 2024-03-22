import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ee = false;
        boolean ab = false;

        for(int i=0; i<str.length() - 1; i++) {
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                ee = true;
            }

            if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {
                ab = true;
            }
        }

        if(ee == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No");
        }

        if(ab == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No");
        }


    }
}