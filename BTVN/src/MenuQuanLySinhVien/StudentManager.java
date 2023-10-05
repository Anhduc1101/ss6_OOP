package MenuQuanLySinhVien;

import java.util.Scanner;

public class StudentManager {
    static Student[] students = new Student[100];
    static int curentIndex = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. xóa học sinh");
            System.out.println("0. Thoát");
            System.out.println("----------------------------");
            System.out.println("Nhập lựa chọn của bạn (0-4): ");
            int choice = Integer.parseInt(scanner.nextLine());
            handleSelect(choice);


//            System.out.println("Nhập số lượng học sinh muốn thêm: ");
//            int size = Integer.parseInt(scanner.nextLine());
//            Student[] students = new Student[size];
//            System.out.println("Nhập thông tin học sinh: ");
//            for (int i = 0; i < students.length; i++) {
//                System.out.println("Thông tin sinh viên thứ " + (i + 1));
//                Student student = new Student();
//                student.inputData();
//                students[i] = student;
//            }
//            for (int j = 0; j < students.length; j++) {
//                students[j].displayData();
//            }
        }
    }

    private static void handleSelect(int choice) {
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                displayAllStudent();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            default:
                break;

        }
    }

    private static void deleteStudent() {
        System.out.println("Hãy nập id của học sinh cần sửa: ");
        int deletedId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < curentIndex; i++) {
            if (students[i].getStudentId() == deletedId) {
                for (int j = i; j < curentIndex; j++) {
                    students[j] = students[j + 1];
                }
                curentIndex--;
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh đó trong danh sách");
    }

    private static void editStudent() {
        System.out.println("Hãy nập id của học sinh cần sửa: ");
        int editedId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < curentIndex; i++) {
            if (students[i].getStudentId() == editedId) {
                System.out.println("Thông tin sinh viên mà bạn muốn sửa: ");
                students[i].displayData();
                students[i].inputData();
                System.out.println("Bạn đã sửa thành công thông tin sinh viên");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh đó trong danh sách ");
    }

    private static void displayAllStudent() {
        System.out.println("Danh sách tất cả sinh viên: ");
        for (int i = 0; i < curentIndex; i++) {
            students[i].displayData();
        }
        System.out.println("------------------------------");
    }

    private static void addStudent() {
        Student student = new Student();
        student.inputData();
        students[curentIndex++] = student;
    }
}
