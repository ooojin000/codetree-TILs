import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        String[] arr = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

        int cnt = 0;

        for(int i=0; i<5; i++) {
            if(arr[i].charAt(2) == a || arr[i].charAt(3) == a) {
                System.out.println(arr[i]);
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}