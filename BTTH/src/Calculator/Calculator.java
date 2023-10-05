package Calculator;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số a: ");
        this.a= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số b: ");
        this.b= Double.parseDouble(scanner.nextLine());
    }

    public double add(double a,double b){
        return this.a+this.b;
    }
    public double sub(double a,double b){
        return this.a-this.b;
    }
    public double multi(double a,double b){
        return this.a*this.b;
    }
    public double div(double a,double b){
        return this.a/this.b;
    }


    public void displayData() {
        System.out.println( "Calculator{" +
                "Số a nhập vào là: " + a +
                " ,số b nhập vào là: " + b +
                '}');
    }
}
