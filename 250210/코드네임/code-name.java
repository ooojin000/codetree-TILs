import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] codeName = new char[5];
        int[] score = new int[5];

        for(int i = 0; i < 5; i++) {
            codeName[i] = sc.next().charAt(0);
            score[i] = sc.nextInt();
        }

        int min = 100;
        int index = 0;

        for(int i = 0; i < 5; i++) {
            if(score[i] < min) {
                min = score[i];
                index = i;
            }
        }

        System.out.print(codeName[index] + " " + score[index]);
    }
}