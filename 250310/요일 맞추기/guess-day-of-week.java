import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();


        int date1 = elapsedDays(m1, d1);
        int date2 = elapsedDays(m2, d2);

        int diff = date2 - date1;

        while(diff < 0) {
            diff += 7;
        }

        
        String[] day_of_the_week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.print(day_of_the_week[diff & 7]);
        
    }

    public static int elapsedDays(int m, int d) {
        int elapsedDays = 0;

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < m; i++) {
            elapsedDays += num_of_days[i];
        }
        elapsedDays += d;
        
        return elapsedDays;
    }
}