import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] results = new char[3];
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int cntD = 0;

        for (int i = 0; i < 3; i++) {
            String symptoms = sc.next();

            int temperature = sc.nextInt();

            if (symptoms.equalsIgnoreCase("Y") && temperature >= 37) {
                results[i] = 'A';
                cntA++;
            } else if (symptoms.equalsIgnoreCase("N") && temperature >= 37) {
                results[i] = 'B';
                cntB++;
            } else if (symptoms.equalsIgnoreCase("Y") && temperature < 37) {
                results[i] = 'C';
                cntC++;
            } else if (symptoms.equalsIgnoreCase("N") && temperature < 37) {
                results[i] = 'D';
                cntD++;
            } else {
                results[i] = 'X';
            }
        }

        if (cntA >= 2) {
            System.out.println(cntA + " " + cntB + " " + cntC + " " + cntD + " E");
        } else {
            System.out.println(cntA + " " + cntB + " " + cntC + " " + cntD);
        }

    }
}