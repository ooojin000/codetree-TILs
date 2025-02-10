import java.util.*;

public class Main {
    public static final int MAX_N = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        int[] arr2 = new int[MAX_N];

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                if(i == 0) {
                    arr2[index] = arr[i];
                } else {
                    Arrays.sort(arr, 0, i + 1);
                    arr2[index] = arr[i / 2];
                }
                index++;                
            }
        }

        for(int i = 0; i < index; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}