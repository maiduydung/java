// package exercise;


public class TestDurian {
    public static void main(String... args) {
        Durian durian1 = new Durian();
        Durian durian2 = new Durian();

        durian1.peel();

        System.out.printf("Durian 1 %s\n", durian1.getState());
        System.out.printf("Durian 2 %s\n", durian2.getState());
    }
}