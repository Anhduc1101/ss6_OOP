package Employee;


import MenuQuanLySinhVien.Student;

import java.util.Scanner;

public class EmployeeTest {
    static Employee[] employees = new Employee[5];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Tạo danh sách 5 nhân viên");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhập nhân viên thứ: "+(i+1));
            Employee employee = new Employee();
            employee.inputData(scanner);
            employees[i] = employee;

        }
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayData();
        }
    }
}
