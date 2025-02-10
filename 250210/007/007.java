import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        int n = sc.nextInt();

        Code007 code1 = new Code007(str, a, n);

        System.out.println("secret code : " + code1.sc);
        System.out.println("meeting point : " + code1.mp);
        System.out.println("time : " + code1.t);
    }
}

class Code007 {
    String sc;
    char mp;
    int t;

    public Code007(String secretCode, char meetingPoint, int time) {
        this.sc = secretCode;
        this.mp = meetingPoint;
        this.t = time;
    }
}