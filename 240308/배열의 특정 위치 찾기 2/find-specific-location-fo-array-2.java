import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int even = 0;
        int odd = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(i%2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        if(even > odd) {
            System.out.print(even-odd);
        } else {
            System.out.print(odd-even);
        }
    }
}