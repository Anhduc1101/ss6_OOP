package MenuQuanLySinhVien;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String tel;
    private static int count = 1;

    public Student() {
        this.studentId = count++;
    }

    public int getStudentId() {
        return studentId;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên SV: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính : ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        this.address = scanner.nextLine();
        System.out.println("Nhập SĐT: ");
        this.tel = scanner.nextLine();
    }


    public void displayData() {
        System.out.println("Student Info: {" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}');
    }
}
