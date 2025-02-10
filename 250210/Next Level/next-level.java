import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        UserInfo userInfo = new UserInfo();
        System.out.println("user " + userInfo.id + " lv " + userInfo.level);

        userInfo.id = str;
        userInfo.level = n;
        System.out.println("user " + userInfo.id + " lv " + userInfo.level);
    }
}

class UserInfo {
    String id;
    int level;

    public UserInfo() {
        this.id = "codetree";
        this.level = 10;
    }

    public UserInfo(String id, int level) {
        this.id = id;
        this.level = level;
    }
}