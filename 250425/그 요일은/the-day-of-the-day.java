import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int elapsedDays = 0;

        int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(m1 == m2 && d1 == d2)
                break;
            
            elapsedDays++;
            d1++;

            if(d1 > num_of_days[m1]) {
                m1++;
                d1 = 1;
            }
        }

        switch (A) {
            case "Mon" : elapsedDays += 7;
                break;
            case "Tue" : elapsedDays += 6;
                break;
            case "Wed" : elapsedDays += 5;
                break;
            case "Thu" : elapsedDays += 4;
                break;
            case "Fri" : elapsedDays += 3;
                break;
            case "Sat" : elapsedDays += 2;
                break;
            case "Sun" : elapsedDays += 1;
                break;
        }

        System.out.print(elapsedDays / 7);
    }
}