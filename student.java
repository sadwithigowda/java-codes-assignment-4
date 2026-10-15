
class StudentInfo {
    int rollNo;
    String name;

    StudentInfo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(101, "Rahul");
        System.out.println("Student Details");
        s1.display();
    }
}
