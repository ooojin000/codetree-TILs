import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc. next();
        int ee = 0;
        int eb = 0;

        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                ee++;
            }

            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b') {
                eb++;
            }
        }

        System.out.print(ee + " " + eb);
    }
}