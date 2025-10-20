import java.util.*;

public class Main {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push")) {
                push(sc.nextInt());
            } else if (s.equals("size")) {
                size();
            } else if (s.equals("empty")) {
                empty();
            } else if (s.equals("pop")) {
                pop();
            } else {
                top();
            }
        }
    }

    public static void push (int n) {
        stack.push(n);
    }

    public static void pop () {
        System.out.println(stack.pop());
    }

    public static void top () {
        System.out.println(stack.peek());
    }

    public static void size () {
        System.out.println(stack.size());
    }

    public static void empty () {
        System.out.println(stack.empty() ? 1 : 0);
    }
}