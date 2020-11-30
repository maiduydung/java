
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mai", 3);
        System.out.printf("%s %d\n", student.getName(), student.getGrade());
        Student student2 = new Student("Dung");
        System.out.printf("%s %d\n", student2.getName(), student2.getGrade());
        if(student.belongsToCourse()){
            System.out.printf("%s joined a course\n", student.getName());
        }

        System.out.printf("number of students %d\n", Student.getCnt());

    }
}