package Employee;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private double rate;
    private double salary;
    private static int count = 1;

    public Employee() {
        this.employeeId = count++;
    }

    public Employee(int employeeId, String employeeName, int age, boolean gender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên NV: ");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính : ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương : ");
        this.rate = Double.parseDouble(scanner.nextLine());

    }

    public double calSalary() {
        salary = rate * 1300000;
        return salary;
    }

    DecimalFormat formatter = new DecimalFormat("###,###,###");

    public void displayData() {
        System.out.println("Employee Info: {" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", rate=" + rate +
                ", salary=" + formatter.format(this.calSalary()) + "vnd" +
                '}');
    }
}
