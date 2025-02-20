import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Coordinate[] coordinates = new Coordinate[n];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int num = i + 1;
            coordinates[i] = new Coordinate(x, y, num);
        }

        Arrays.sort(coordinates);

        for(int i = 0; i < n; i++) {
            System.out.println(coordinates[i].num);
        }
    }
}

class Coordinate implements Comparable<Coordinate> {
    int x, y, num;

    public Coordinate(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    public int compareTo(Coordinate coordinate) {
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(coordinate.x) + Math.abs(coordinate.y));
    }
}