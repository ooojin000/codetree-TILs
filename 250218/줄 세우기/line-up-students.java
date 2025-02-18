import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int num = i + 1;
            students[i] = new Student(height, weight, num);
        }

        Arrays.sort(students, (a, b) -> {
            if(a.height != b.height) {
                return b.height - a.height;
            } else if(a.weight != b.weight) {
                return b.weight - a.weight;
            } else {
                return a.num - b.num;
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.println(students[i].num + " ");
        }
    }
}

class Student {
    int height, weight, num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
}