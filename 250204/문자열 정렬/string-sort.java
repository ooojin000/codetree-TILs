import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] a = str.toCharArray();
        Arrays.sort(a);
        String sortedStr = new String(a);
        System.out.print(sortedStr);
    }
}