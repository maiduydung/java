package sample2;


public class Main {
    public static void main(String[] args) {
       Student st = new Student("1234", "Mai", 9);
       System.out.printf("%s",st.getStudentProfile());
       Teacher t = new Teacher("9999", "Dung", "PhD");
       System.out.printf("%s",t.getTeacherProfile());
    }
}

