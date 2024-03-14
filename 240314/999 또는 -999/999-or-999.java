import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int i=0; i<100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999) {
                break;
            }

            if(minVal > arr[i]) {
                minVal = arr[i];
            }

            if(maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal + " " + minVal);
    }
}