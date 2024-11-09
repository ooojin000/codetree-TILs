import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (seq(arr1, arr2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean seq(int arr1[], int arr2[]) {
        boolean result = false;
        for(int i = 0; i < arr1.length; i++) {
            if(arr2[0] == arr1[i]) {
                for(int j = 0; j < arr1.length - arr2.length; j++) {
                    if(arr1[i] == arr2[j]) {
                        result = true;
                    } 
                }
            } 
        }
        return result;
    }
}