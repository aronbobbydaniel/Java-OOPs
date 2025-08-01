package mevin;

class Student {
    String name;
    int rollNumber;
    static int studentCount = 0;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        studentCount++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Total Students: " + studentCount);
    }
}

public class Static {
    public static void main(String[] args) {
        Student student1 = new Student("Otis", 28);
        student1.displayDetails();

        Student student2 = new Student("Alice", 35);
        student2.displayDetails();
    }
}
