import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        char a = sc.next().charAt(0);

        int idx = -1;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == a) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            System.out.print("No");
        } else {
            System.out.print(idx);
        }
    }
}