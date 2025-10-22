import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff = elapsedDays(m2, d2) - elapsedDays(m1, d1);

        while(diff < 0) {
            diff += 7;
        }
        
        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.print(dayOfWeek[diff % 7]);
        
    }

    public static int elapsedDays(int m, int d) {
        int totalDays = 0;
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < m; i++) {
            totalDays += days[i];
        }
        totalDays += d;
        
        return totalDays;
    }
}