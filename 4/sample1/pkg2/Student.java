package sample1.pkg2;


public class Student {
    public final static int MIN_COURSE_GRADE = 2;
    public final static int MIN_COURSE_CREDIT = 22;
    private final String name;
    private int grade;
    private static int cnt = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        Student.cnt++;
    }
    public Student(String name) {
        this(name, 1);
    }
    public boolean belongsToCourse() {
        return this.grade >= MIN_COURSE_GRADE;
    }
    public boolean belongsToCourse(int credit) {
        return (this.grade >= MIN_COURSE_GRADE) && (credit >= MIN_COURSE_CREDIT);
    }
    public static boolean older(Student a, Student b) {
        return a.grade > b.grade;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void promoteGrade() {
        grade++;
    }
    public static int getCnt() {
        return cnt;
    }
}
