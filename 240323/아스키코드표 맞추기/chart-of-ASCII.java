import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        char[] c = new char[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            c[i] = (char)arr[i];
            System.out.print(c[i] + " ");
        }
    }
}