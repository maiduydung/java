public class Student {
    private final String name;
    private int grade;
    private static int cnt = 0;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        Student.cnt++;
    }

    //overload
    Student(String name){
        this.name = name;
        this.grade = 1;
        Student.cnt++;
    }

    boolean belongsToCourse(){
        return this.grade >= 2;
    }
}
