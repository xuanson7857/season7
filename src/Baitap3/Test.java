package Baitap3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        // Truy cập phương thức setName() và setClasses()
        student.setName("Alice");
        student.setClasses("C03");

        // Hiển thị thông tin đã được thay đổi
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());

        // Thay đổi access modifier cho các phương thức setName() và setClasses()
        // bằng cách thay đổi private thành public
        // Sau đó, test lại

        // Truy cập phương thức setName() và setClasses() đã thay đổi
        student.setName("Bob");
        student.setClasses("C04");

        // Hiển thị thông tin đã được thay đổi
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());
    }
}