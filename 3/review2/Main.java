public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mai", 3);
        System.out.printf("%s, %d", student.name, student.grade);

        Student student2 = new Student("Dung");
        System.out.printf("%s, %d", student2.name, student2.grade);

        if(student.belongsToCourse()){
            System.out.printf("belongsToCourse\n");
        }
    }
}
