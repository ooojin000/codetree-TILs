import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double val;
        double sum = 0;
        double avg = 0;

        for(int i=0; i<n; i++) {
            val = sc.nextDouble();
            sum += val;
        }
        avg = sum/n;

        System.out.printf("%.1f", avg);
        System.out.println();
        if(avg>=4.0){
            System.out.print("Perfect");
        } else if(avg>=3.0){
            System.out.print("Good");
        } else if(avg<3.0){
            System.out.print("Poor");
        }
    }
}