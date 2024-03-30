import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];

        int n = 0;

        for(int i = 0; i < 10; i++) {
            str[i] = sc.next();
            if(str[i].equals("END")) {
                n = i;
                break;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = str[i].length() - 1; j >= 0 ; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
        
    }
}