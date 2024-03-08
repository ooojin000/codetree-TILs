import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sum = 0;
        double avg = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>=250){
                for(int j=0; j<i; j++){
                    sum += arr[j];
                    avg = sum/(j+1);
                }
            }
        }
     
        System.out.print(sum + " " + avg);

    }
}