import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Location[] locations = new Location[n];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int num = i + 1;
            locations[i] = new Location(x, num);
        }

        Arrays.sort(locations);

        for(int i = 0; i < n; i++) {
            locations[i].newNum = i + 1;
        }

        Arrays.sort(locations, new Comparator<Location>() {
            @Override
            public int compare(Location a, Location b) {
                return a.num - b.num;
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.print(locations[i].newNum + " ");
        }
    }
}

class Location implements Comparable<Location> {
    int x, num, newNum;

    public Location(int x, int num) {
        this.x = x;
        this.num = num;
        this.newNum = newNum;
    }

    @Override
    public int compareTo(Location location) {
        return this.x - location.x;
    }
}