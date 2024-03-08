import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int tmp = 0;

        int sum = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                break;
            }
            tmp++;
        }

        for(int i=0; i<tmp; i++){
            sum += arr[i];
        }

        System.out.printf("%d %.1f", sum, (double)sum/tmp);

    }
}