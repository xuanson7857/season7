
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap vaao kich thuoc cua hinh tron");
        System.out.println("R=");
        double r=Double.parseDouble(scanner.nextLine());
        System.out.println("Dien tich hinh tron la " +StaticMethod.calCircleArea(r));
        System.out.println("hay nhap vao kich thuoc cua hinh chu nhat");
        System.out.println("W=");
        double w=Double.parseDouble(scanner.nextLine());
        System.out.println("H=");
        double h=Double.parseDouble(scanner.nextLine());
        System.out.println("dien tich hinh chu nhat la" );

        System.out.println("hay nhap vao kich thuoc cua hinh tam giac");
        System.out.println("A=");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("B=");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.println("C=");
        double c=Double.parseDouble(scanner.nextLine());
        System.out.println("dien tich cua hinh tam giac la :" );
    }
}