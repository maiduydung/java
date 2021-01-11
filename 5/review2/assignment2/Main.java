package assignment2;

import assignment2.figures.WriteablePyramid;

public class Main {
    public static void main(String[] args) {
        WriteablePyramid p = new WriteablePyramid(4);
        p.draw();
        p.write("tmp.txt");
    }
}