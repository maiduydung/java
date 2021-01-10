import java.util.concurrent.ThreadLocalRandom;


public class Area {
    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.printf("%f\n", randomNum*randomNum*3.14);
    }
    
}
