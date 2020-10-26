

public class TestApple {
    public static void main(String... args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        apple1.peel();

        System.out.printf("Apple 1 %s\n", apple1.getState());
        System.out.printf("Apple 2 %s\n", apple1.getState());
    }
}