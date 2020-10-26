



public class TestFruit {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Durian durian = new Durian();
    
        
    
        System.out.printf("orange before %s\n", orange.getState());
        System.out.printf("apple before %s\n", apple.getState());
        System.out.printf("durian before %s\n", durian.getState());

        durian.peel();
        apple.peel();
        orange.peel();

        System.out.printf("orange after %s\n", orange.getState());
        System.out.printf("apple after %s\n", apple.getState());
        System.out.printf("durian after %s\n", durian.getState());
    }
}