import java.util.Scanner;

public class Category {
    private int categoryId;
    private String categoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void inputDataCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã danh mục: ");
        this.categoryId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên danh mục: ");
        this.categoryName = String.valueOf(scanner.nextLine());
    }


    public void displayDataCategory() {
        System.out.println("Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}');
    }
}
