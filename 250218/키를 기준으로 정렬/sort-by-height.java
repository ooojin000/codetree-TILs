import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SortByHeight[] sortByHeight = new SortByHeight[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            sortByHeight[i] = new SortByHeight(name, height, weight);
        }

        Arrays.sort(sortByHeight, (a, b) -> a.height - b.height);

        for(int i = 0; i < n; i++) {
            System.out.println(sortByHeight[i].name + " " + sortByHeight[i].height + " " + sortByHeight[i].weight);
        }
    }
}

class SortByHeight {
    String name;
    int height, weight;

    public SortByHeight(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}