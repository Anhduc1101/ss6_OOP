import java.util.Scanner;

public class Rectangle {
    //    1. fields
    private double height;
    private double width;

    //    2. constructor
    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

//    3. methods
//    getter and setter

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter(){
        return (height+width)*2;
    }

    public  double getArea(){
        return height*width;
    }

    public void display(){
        System.out.println("Hình chữ nhật có chiều daaif là: "+width+" ,chiều rộng là: "+height);


    }

    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào chiều dài: "+width);
        this.width= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào chiều rộng: "+height);
        this.height= Double.parseDouble(scanner.nextLine());
    }
}
