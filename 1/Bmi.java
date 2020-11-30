public class Bmi {
    public static void printRisk(int age, double h, double w){
        double bmi = w / ((h / 100) * (h / 100));
        if(age < 45){
            if (bmi < 22.0){
                System.out.printf("Your BMI: %f\n", bmi);
                System.out.printf("Your risk: Low\n");
            }
            else{
                System.out.printf("Your BMI: %f\n", bmi);
                System.out.printf("Your risk: Medium\n");
            }
        }
        else{
            if (bmi < 22.0){
                System.out.printf("Your BMI: %f\n", bmi);
                System.out.printf("Your risk: Medium\n");
            }
            else{
                System.out.printf("Your BMI: %f\n", bmi);
                System.out.printf("Your risk: High\n");
            }
        }
    }

    public static void main(String[] args) {
        int age = 30;
        double h = 162.0;
        double w = 52.0;

        printRisk(age, h, w);
    }
}