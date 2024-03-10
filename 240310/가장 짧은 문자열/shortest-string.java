import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];

        for(int i=0; i<3; i++) {
            str[i] = sc.next();
        }

        int len1 = str[0].length();
        int len2 = str[1].length();
        int len3 = str[2].length();

        if(len1 > len2 & len1 > len3) {
            if(len2 > len3) {
                System.out.print(len1-len3);
            } else {
                System.out.print(len1-len2);
            }
        } else if(len2 > len1 & len2 > len3) {
            if(len1 > len3) {
                System.out.print(len2-len3);
            } else {
                System.out.print(len2-len1);
            }
        } else {
            if(len1 > len2) {
                System.out.print(len3-len2);
            } else {
                System.out.print(len3-len1);
            }
        }
    }
}