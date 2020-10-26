package sample1.pkg2;
import sample1.pkg1.Member;

public class Student extends Member {
    private int grade;
    //String name = "dummy";

    public Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    @Override
    public boolean canReserveRoom() {
        return false;
    }
    
    @Override
    protected String getEmail() {
        return name + DOMAIN;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade:  ").append(grade).append("\n");
        String email = getEmail();
        sb.append("email:  ").append(email).append("\n");
        return sb.toString();
    }
}
