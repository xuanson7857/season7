package Baitap2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);

        // Truy cập các phương thức getRadius() và getArea()
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        // Thay đổi access modifier cho các phương thức getRadius() và getArea()
        // bằng cách thay đổi private thành public
        // Sau đó, test lại

        // Truy cập các phương thức getRadius() và getArea() đã thay đổi
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
