import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push")) {
                queue.add(sc.nextInt());
            } else if (s.equals("pop")) {
                System.out.println(queue.poll());
            } else if (s.equals("size")) {
                System.out.println(queue.size());
            } else if (s.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (s.equals("front")) {
                System.out.println(queue.peek());
            }
        }
    }
}