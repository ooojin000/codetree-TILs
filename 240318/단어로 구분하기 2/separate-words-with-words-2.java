import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];

        for(int i=0; i<10; i++) {
            str[i] = sc.next();
            if(i%2==0) {
                System.out.println(str[i]);
            }
        }
    }
}