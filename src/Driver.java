public class Driver {
    public static void main(String[] args) {

        Shape shape1 = new Shape("red", true);
        System.out.println(shape1.toString());


        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1.toString());

        Circle circle1 = new Circle(3.0, "green");
        System.out.println(circle1.toString());


        circle1.setRadius(4.0);
        System.out.println(circle1.toString());


        System.out.println("Area of circle1 is " + circle1.getArea());
        System.out.println("Perimeter of circle1 is " + circle1.getPerimeter());
    }
}