import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nArr = new int[1000];
        int[] mArr = new int[1000];

        int sec = 1;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = sec; j < t + sec; j++) {
                if (c == 'R') {
                    nArr[j] = ++pos;
                } else if (c == 'L') {
                    nArr[j] = --pos;
                }
            }
            sec += t;
        }

        sec = 1;
        pos = 0;

        for (int i = 0; i < m; i++) {
            char c = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = sec; j < t + sec; j++) {
                if (c == 'R') {
                    mArr[j] = ++pos;
                } else if (c == 'L') {
                    mArr[j] = --pos;
                }
            }
            sec += t;
        }

        int result = -1;

        for (int i = 1; i <= sec; i++) {
            if (nArr[i] == mArr[i]) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}