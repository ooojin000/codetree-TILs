import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] info = new Info[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            info[i] = new Info(name, addr, city);
        }

        int min_val = 0;

        for(int i = 1; i < n; i++) {
            if(info[i].name.compareTo(info[min_val].name) > 0) {
                min_val = i;
            }
        }

        System.out.println("name " + info[min_val].name);
        System.out.println("addr " + info[min_val].addr);
        System.out.println("city " + info[min_val].city);
    }
}

class Info {
    String name, addr, city;

    public Info() {
        this.name = "";
        this.addr = "";
        this.city = "";
    }

    public Info(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}