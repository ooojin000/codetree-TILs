import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[200];

        int n = 0;

        for(int i = 0; i < 200; i++) {
            str[i] = sc.next();
            n = i;
            if(str[i].equals("0")) {
                break;
            }
        }

        System.out.println(n);

        for(int i = 0; i < n; i+=2) {
            System.out.println(str[i]);
        } 
    }
}