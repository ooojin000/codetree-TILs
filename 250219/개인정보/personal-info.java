import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            float weight = sc.nextFloat();
            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students);

        System.out.println("name");

        for(int i = 0; i < 5; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight + " ");
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return Integer.compare(b.height, a.height);
            }
        });

        System.out.println();
        System.out.println("height");

        for(int i = 0; i < 5; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight + " ");
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int height;
    float weight;

    public Student(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}