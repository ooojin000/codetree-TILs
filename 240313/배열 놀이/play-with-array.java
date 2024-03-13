import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();

        int[] nArr = new int[n];

        for(int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++) {
            int qType = sc.nextInt();
            if(qType == 1) {
                int idx = sc.nextInt();
                System.out.println(nArr[idx-1]);
            } else if(qType == 2) { 
                int idx = sc.nextInt();
                for(int j=0; j<n; j++) {
                    if(nArr[j] == idx) {
                        System.out.println(j+1);
                    }
                }
            } else if(qType == 3) { 
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j=a-1; j<b; j++) {
                    System.out.println(nArr[j] + " ");
                }
            }
        }
        
        

    }
}