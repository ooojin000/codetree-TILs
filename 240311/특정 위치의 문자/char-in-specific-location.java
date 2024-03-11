import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};  
        char n = sc.next().charAt(0);

        int idx = -1;

        for(int i=0; i<6; i++){
            if(word[i] == n){
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.println("None");
        } else {
            System.out.print(idx);
        }
    }
}