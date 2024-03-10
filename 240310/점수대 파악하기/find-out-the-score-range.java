import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] cntArr = new int[101];

        for(int i=0; i<100; i++){
            arr[i] = sc.nextInt();
            cntArr[(arr[i]/10)*10]++;
            if(arr[i] == 0){
                break;
            }
        }

        for(int i=100; i>=10; i-=10) {
            System.out.println(i + " - " + cntArr[i]);
        }
    }
}