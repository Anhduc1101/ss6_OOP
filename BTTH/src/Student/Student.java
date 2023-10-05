import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;


//    2. constructor
    public Student(){

    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

//    3. getter and setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String displayData() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", sex=" + (sex?"female":"male") +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã SV: ");
        this.studentId= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên SV: ");
        this.studentName= scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        this.sex= Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập tuổi SV: ");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        this.address=scanner.nextLine();
        System.out.println("Nhập lớp của SV: ");
        this.className= scanner.nextLine();
    }
}
