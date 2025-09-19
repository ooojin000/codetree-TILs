import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> v = new ArrayList<>();

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if (a.equals("push_back")) {
                pushBack();
            } else if (a.equals("pop_back")) {
                popBack();
            } else if (a.equals("size")) {
                size();
            } else if (a.equals("get")) {
                get();
            }
        }

    }

    public static void pushBack() {
        int num = sc.nextInt();
        v.add(num);
    }

    public static void popBack() {
        v.remove(v.size() - 1);
    }

    public static void size() {
        System.out.println(v.size());
    }

    public static void get() {
        int k = sc.nextInt();
        if ((k - 1) >= 0 && (k - 1) < v.size())
            System.out.println(v.get(k - 1));
    }
}