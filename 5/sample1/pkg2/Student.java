package sample2;
import sample1.pkg1.Member;

public class Student extends Member {
    int grade;
    String name = "dummy";

    Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }
    
    @Override
    String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade:  ").append(grade).append("\n");
        return sb.toString();
    }
}
