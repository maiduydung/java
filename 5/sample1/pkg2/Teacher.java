package sample2;
import sample1.pkg1.Member;

public class Teacher extends Member{
    String title;

    Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }
    @Override
    String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append(super.getProfile());
        sb.append("Title:  ").append(title).append("\n");
        return sb.toString();
    }
    @Override
    String getEmail() {
        return name + DOMAIN;
    }
}
