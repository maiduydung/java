public class Student {
    public final static int MIN_COURSE_GRADE = 2;
    public final static int MIN_COURSE_CREDIT = 22;
    private final String name;
    private int grade;
    private static int cnt = 0;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        Student.cnt++;
    }

    //overloading
    public Student(String name){
        this.name = name;
        this.grade = 1;
        Student.cnt++;
    }

    public boolean belongsToCourse(){
        return this.grade >= MIN_COURSE_GRADE;
    }
    public boolean belongsToCourse(int credit){
        return (this.grade >= MIN_COURSE_GRADE) && (credit >= MIN_COURSE_CREDIT);
    }

    static boolean older (Student a, Student b){
        return a.grade > b.grade;
    }

    public String getName(){
        return this.name;
    }

    public int getGrade(){
        return this.grade;
    }

    public void promoteGrade(){
        this.grade ++;
    }

    public static int getCnt(){
        return cnt;
    }
}