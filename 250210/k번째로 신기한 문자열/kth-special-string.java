import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str1 = sc.next();

        String[] arr1 = new String[n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.next();

            if(arr1[i].length() >= str1.length()) {
                String str2 = arr1[i].substring(0, str1.length());  

                if(str2.equals(str1)) {
                    cnt++;
                }
            }
            
        }

        int index = 0;

        String[] arr2 = new String[cnt];

        for(int i = 0; i < n; i++) {
            if(arr1[i].length() >= str1.length()) {
                String str2 = arr1[i].substring(0, str1.length());
            
                if(str2.equals(str1)) {
                    arr2[index++] = arr1[i];
                }
            }
        }

        Arrays.sort(arr2);

        System.out.print(arr2[k - 1]);

        

    }
}