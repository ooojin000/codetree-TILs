import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(checkSeason(checkDate(y, m, d)));
    }

    public static int checkDate (int y, int m, int d) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeafYear(y)) {
            if (m == 2) {
                return (d <= 29) ? m : -1;
            } else {
                return (d <= days[m - 1]) ? m : -1;
            }
        } else {
            if (m == 2) {
                return (d <= 28) ? m : -1;
            } else {
                return (d <= days[m - 1]) ? m : -1;
            }
        }
    }

    public static String checkSeason (int n) {
        if (n == -1) return "-1";
        if (n >= 3 && n <= 5) return "Spring";
        if (n >= 6 && n <= 8) return "Summer";
        if (n >= 9 && n <= 11) return "Fall";
        else return "Winter";
    }
 
    public static boolean isLeafYear (int y) {        
        if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
            return true;
        return false;
    }
}