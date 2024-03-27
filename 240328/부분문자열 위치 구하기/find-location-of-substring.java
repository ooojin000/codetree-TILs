import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        int k = 0;

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[0]) {
                
                for(int j = 0; j < arr2.length; j++) {
                    if(arr1[i+j] == arr2[j]) {
                        
                    }
                }
                k = i;
                break;
            } 
        }

        if(k >= 0) {
            System.out.print(k);
        } else {
            System.out.print("-1");
        }

    }
}