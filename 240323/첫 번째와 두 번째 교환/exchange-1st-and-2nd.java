import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        char[] arr1 = str.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if (arr1[i] == arr1[0]) {
                arr[i] = arr1[1];
            }

            if (arr1[i] == arr1[1]) {
                arr[i] = arr1[0];
            }
        }

        str = String.valueOf(arr);

        System.out.print(str);
    }
}