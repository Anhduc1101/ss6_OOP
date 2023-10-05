package Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.inputData();
        calculator.displayData();
        System.out.println("Tổng cuả 2 số là: "+calculator.add(calculator.getA(), calculator.getB()));
        System.out.println("Hiệu cuả 2 số là: "+calculator.sub(calculator.getA(), calculator.getB()));
        System.out.println("Tích cuả 2 số là: "+calculator.multi(calculator.getA(), calculator.getB()));
        System.out.println("Thương cuả 2 số là: "+calculator.div(calculator.getA(), calculator.getB()));
    }
}
