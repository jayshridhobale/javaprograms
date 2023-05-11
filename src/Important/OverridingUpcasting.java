package Important;
//write a java program to explian method overriding and upcasting
class Shape1 {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle1 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle1 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class OverridingUpcasting {
    public static void main(String[] args) {
        Shape1 shape = new Shape1();
        Shape1 circle = new Circle1();
        Shape1 triangle = new Triangle1();

        shape.draw();
        circle.draw();
        triangle.draw();

        // Upcasting
        Shape1 s1 = new Circle1();
        s1.draw();
    }
}

