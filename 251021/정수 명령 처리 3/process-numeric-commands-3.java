import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push_front")) {
                deque.addFirst(sc.nextInt());
            } else if (s.equals("push_back")) {
                deque.addLast(sc.nextInt());
            } else if (s.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            } else if (s.equals("pop_back")) {
                System.out.println(deque.pollLast());
            } else if (s.equals("size")) {
                System.out.println(deque.size());
            } else if (s.equals("empty")) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            } else if (s.equals("front")) {
                System.out.println(deque.peekFirst());
            } else if (s.equals("back")) {
                System.out.println(deque.peekLast());
            } 
        }
    }
}