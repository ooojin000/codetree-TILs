import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for(int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(aArr[i] != bArr[i]) {
                cnt++;
            }
        }

        if(cnt == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}