package sample2;

import sample1.pkg1.Member;
import sample1.pkg2.Student;
import sample1.pkg2.Teacher;

public class Main {
    public static void main(String[] args) {
        Member st = new Student("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        Member t = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(t.getProfile());
    }
}