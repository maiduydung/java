package animals;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        Cat cat = new Cat();
    
        human.run();
        cat.run();
        dog.run();

        System.out.println(human.get());
        System.out.println(dog.get());
        System.out.println(cat.get());
        
        System.out.println(dog.bark());
        System.out.println(cat.bark());
        
        System.out.println(human.talk());

        
    }
}