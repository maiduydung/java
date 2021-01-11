package test;

public class Main {
    public static void main(String[] args) {
        GenericsSample<String> g1 = new GenericsSample<String>("Mai", "Dung");
        System.out.printf("%s\n", g1.getFirst());
        System.out.printf("%s\n", g1.getSecond());

        GenericsSample<String> g2 = new GenericsSample<String>("Rei", "Ayanami");
        System.out.printf("%s\n", g2.getFirst());
        System.out.printf("%s\n", g2.getSecond());
    }
}
