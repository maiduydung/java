package animals;

public class Animal {
    protected String stomach;

    public String get() {
        stomach = "full";
        return stomach;
    }

    public String run() {
        stomach = "hungry";
        return stomach;
    }
}