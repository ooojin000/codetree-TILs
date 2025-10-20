import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] cArr = str.toCharArray();


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (cArr[i] == '(') {
                stack.push(cArr[i]);
            } else if (cArr[i] == ')') {
                if (stack.empty()) {
                    System.out.print("No");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.empty()) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}