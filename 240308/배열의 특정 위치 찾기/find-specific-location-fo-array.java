import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum2 = 0;
        int sum3 = 0;
        int tmp = 0;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<10; i+=2) {
            sum2 += arr[i];
        }

        for(int i=2; i<10; i+=3){
            sum3 += arr[i];
            tmp++;
        }

        System.out.printf("%d %.1f", sum2, (double)sum3 / tmp);
    }
}