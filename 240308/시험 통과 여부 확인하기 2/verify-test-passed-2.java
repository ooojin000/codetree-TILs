import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[4];
        int[] sum = new int[num];
        int[] avg = new int[num];
        int tmp = 0;

        for(int j=0; j<num; j++){
            for(int i=0; i<4; i++){
                arr[i] = sc.nextInt();
                sum[j] += arr[i];
            }
            avg[j] = sum[j]/4;

            if(avg[j]>=60){
                System.out.println("pass");
                tmp++;
            }else {
                System.out.println("fail");
            }
            

        }
        System.out.print(tmp);
        
    }
}