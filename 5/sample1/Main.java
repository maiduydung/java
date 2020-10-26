package sample1;

import sample1.pkg1.Member;
import sample1.pkg1.Programmer;
import sample1.pkg2.Student;
import sample1.pkg2.Teacher;

import sample1.pkg2.EngineeringStudent;


//make absolutely sure to compile this from outside the sample1 package
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ javac sample1/pkg2/*.java
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ javac sample1/pkg1/*.java
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ javac sample1/*.java
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ java sample1.Main 

public class Main {
    public static void main(String[] args) {
        // Member st = new Student("1234", "Taro", 1);
        // System.out.printf(st.getProfile());
        // Member t = new Teacher("1000", "Inoue", "Professor");
        // System.out.printf(t.getProfile());
        EngineeringStudent st = new EngineeringStudent("1234", "Mai", 1);
        System.out.printf(st.getProfile());
        checkSkill(st);
    }

    private static void checkSkill(Programmer p){
        if (p.canWritePython()) {
            System.out.printf("I can write Python\n");
        }
        if (p.canWriteC()) {
            System.out.printf("I can write C\n");
        }
        if (p.canWriteJava()) {
            System.out.printf("I can write Java\n");
        }
    }

}