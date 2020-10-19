package sample2;


public class Main {
    public static void main(String[] args) {
       Member st = new Student("1234", "Mai", 9);
       System.out.printf("%s",st.getProfile());
       Member t = new Teacher("9999", "Dung", "PhD");
       System.out.printf("%s",t.getProfile());

       //printMember(st);
    }

    private static void printMember(Member m){
        System.out.printf("%s\n", m.id);
        System.out.printf("%s\n", m.name);
        System.out.printf("%s\n", m.getEmail());
    }
}

