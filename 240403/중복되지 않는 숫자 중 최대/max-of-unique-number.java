import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] duplication = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            duplication[num]++;
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (duplication[num] == 1 && num > max) {
                max = num;
            }
        }

        if (max == 0) {
            System.out.print("-1");
        } else {
            System.out.print(max);
        }

        
        
    }
}