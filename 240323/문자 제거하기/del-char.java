import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[20]; 
        
        int length = str.length(); 
        int index = 0;

        while (sc.hasNextInt()) {
            arr[index++] = sc.nextInt();
        }

        for (int i = 0; i < index; i++) {
            int num = arr[i];

            if (length == 1) {
                break;
            } else {
                if (length > num) {
                    str = str.substring(0, num) + str.substring(num + 1);
                } else {
                    str = str.substring(0, length - 1);
                }
                length = str.length();
            }

            System.out.println(str);
        }
    }
}