package sample1.pkg1;
import sample1.pkg2.Student;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taro", 3);
        System.out.printf("%s %d\n", student.getName(), student.getGrade());
        Student student2 = new Student("Jiro");
        System.out.printf("%s %d\n", student2.getName(), student2.getGrade());
        if(student.belongsToCourse()) {
            System.out.println("Belongs to a course.");
        }
        if(student.belongsToCourse(20)) {
            System.out.println("Belongs to a course.");
        }
        System.out.printf("%d students in total.\n", Student.getCnt());
        if(Student.older(student, student2)) {
            System.out.printf("%s is older than %s.\n", student.getName(), student2.getName());
        }
    }
}
