import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, (a, b) -> {
            if(a.height != b.height) 
                return a.height - b.height;
            return b.weight - a.weight;
        });

        for(int i = 0; i < n; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight + " ");
        }
    }
}

class Student {
    String name;
    int height, weight;

    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}