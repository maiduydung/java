package sample2;

//inheritance
public class Student extends Member {
   int grade;

   Student (String id, String name, int grade){
       super(id, name);
       this.grade = grade;
   }
}
