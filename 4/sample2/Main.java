package sample2;


public class Main {
    public static void main(String[] args) {
       Student st = new Student("1234", "Mai", 9);
       System.out.printf("%s %s %d\n", st.id, st.name, st.grade);
       System.out.printf(st.getEmail());
    }
}

