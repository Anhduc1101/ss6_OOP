package Circle;
public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("Chu vi của hình tròn là: "+circle.perimeter());
        System.out.println("Diện tích của hình tròn là: "+circle.area());
    }
}
