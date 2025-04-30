import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int binaryToDecimal = Integer.parseInt(binary, 2);
        System.out.print(binaryToDecimal);
    }
}