import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        UserInfo userInfo = new UserInfo();

        userInfo.id = "codetree";
        userInfo.level = 10;

        System.out.println("user " + userInfo.id + " lv " + userInfo.level);

        UserInfo userInfo2 = new UserInfo();

        userInfo2.id = str;
        userInfo2.level = n;
        System.out.println("user " + userInfo2.id + " lv " + userInfo2.level);
    }
}

class UserInfo {
    String id;
    int level;

    public UserInfo() {
        this.id = "";
        this.level = 0;
    }

    public UserInfo(String id, int level) {
        this.id = id;
        this.level = level;
    }
}