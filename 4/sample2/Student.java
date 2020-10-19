package sample2;

//inheritance
public class Student extends Member {
   int grade;

   Student (String id, String name, int grade){
       //inherit from Member superclass
       super(id, name);
       this.grade = grade;
    }

    @Override
    String getProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("---- Student ----\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Grade: ").append(grade).append("\n");
        String email = getEmail();
        sb.append("Email: ").append(email).append("\n");
        return sb.toString();
    }
}
