package sample2;

public class Teacher extends Member{
    String title;
    Teacher(String id, String name, String title){
        super(id,name);
        this.title = title;
    }

    @Override
    String getProfile(){
        
        StringBuffer sb = new StringBuffer();
        sb.append("---- Teacher ----\n");
        sb.append(super.getProfile());
        sb.append("Title: ").append(title).append("\n");
        // String email = getEmail();
        // sb.append("Email: ").append(email).append("\n");
        return sb.toString();
    }
}