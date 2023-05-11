package Important;

//write a java program to demonstrate multiple inheritance with real time example and appropriate method body
interface Shape {
    double getArea();
}

interface Color {
    String getColor();
}

class Circle implements Shape, Color {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Red");
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Color of circle: " + circle.getColor());
    }
}
