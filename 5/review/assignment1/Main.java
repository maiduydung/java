package review.assignment1;

import review.assignment1.base.Writable;
import review.assignment1.base.Figure;
import review.assignment1.figures.Pyramid;
import review.assignment1.figures.Rectangle;
import review.assignment1.figures.Square;
import review.assignment1.figures.WritablePyramid;

public class Main {
    public static void main(String[] args) {
        //Figure f = new Figure(4);
        Pyramid p = new Pyramid(4);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(10);
        //f.draw();
        System.out.println("---");
        p.draw();
        System.out.println("---");
        r.draw();
        System.out.println("---");
        s.draw();

        WritablePyramid py = new WritablePyramid(10);
        py.draw();
        py.write("tmp.txt");
    }
}