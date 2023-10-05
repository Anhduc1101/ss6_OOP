public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.getPerimeter();
        rectangle.getArea();
        rectangle.display();
        System.out.println("Chu vi hình chữ nhật là: "+rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: "+rectangle.getArea());
        rectangle.getWidth();
        System.out.println("Sau khi thay đổi giá trị của 1 cạnh trở lên: ");
        rectangle.setWidth(30);
        rectangle.setHeight(20);
        rectangle.display();
    }
}
