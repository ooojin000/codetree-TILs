import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        calc(a, o, c);
    }

    public static void calc(int a, char o, int c) {
        if (o == '+')
            System.out.print(a + " + " + c + " = " + (a + c));
        else if (o == '-')
            System.out.print(a + " - " + c + " = " + (a - c));
        else if (o == '*') 
            System.out.print(a + " * " + c + " = " + a * c);
        else if (o == '/')
            System.out.print(a + " / " + c + " = " + a / c);
        else 
            System.out.print("False");
    }
}