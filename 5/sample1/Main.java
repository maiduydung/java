package sample1;

import sample1.pkg1.Member;
import sample1.pkg2.Student;
import sample1.pkg2.Teacher;


//make absolutely sure to compile this from outside the sample1 package
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ javac sample1/pkg2/*.java
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ javac sample1/pkg1/*.java
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ javac sample1/*.java
// (base) maiduydung@maiduydung-ubuntu:~/Desktop/Projects/Java/java/5$ java sample1.Main 

public class Main {
    public static void main(String[] args) {
        Member st = new Student("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        Member t = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(t.getProfile());
    }
}