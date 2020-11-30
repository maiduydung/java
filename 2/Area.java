import java.util.concurrent.ThreadLocalRandom;


public class Area {
    public static void main(String[] args) {
        int r = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        double area = 0.0;
        area = 3.14*r*r;
        System.out.printf("r = %d\n", r);
        System.out.printf("area = %f\n", area);

    }
}