import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++) {
            str[i] = sc.next();
            sum += str[i].length();
        }   

        for(int i=0; i<n; i++) {
            for(int j=0; j<str[i].length(); j++) {
                if(str[i].charAt(j) == 'a') {
                    cnt++;
                }
            }
        }

        System.out.print(sum + " " + cnt);
    }
}