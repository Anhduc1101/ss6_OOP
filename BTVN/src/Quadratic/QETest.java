package Quadratic;

import java.util.Scanner;

public class QETest {
    public static void main(String[] args) {
        QuadraticEquation qeTest = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        qeTest.setA(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào số b: ");
        qeTest.setB(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập vào số c: ");
        qeTest.setC(Double.parseDouble(scanner.nextLine()));
        qeTest.getDiscriminant();
        if (qeTest.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm: r1 là " + qeTest.getRoot1() + " ,r2 là " + qeTest.getRoot2());
        } else if (qeTest.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép r là: " + qeTest.getRoot());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
