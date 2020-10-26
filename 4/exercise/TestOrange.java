import fruit.Orange;
public class TestOrange {
    public static void main(String... args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        orange1.cut();
        orange1.cut();
        orange1.cut();

        orange2.cut();
        orange2.cut();

        System.out.printf("Orange 1 %d pieces\n", orange1.getPieceNumber());
        System.out.printf("Orange 2 %d pieces\n", orange2.getPieceNumber());
    }
}