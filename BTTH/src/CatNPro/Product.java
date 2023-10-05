import java.util.Scanner;




    public class Product {
        int productId;
        String productName;
        float productPrice;
        String category;

        public Product() {
        }

        public Product(int productId, String productName, float productPrice, String category) {
            this.productId = productId;
            this.productName = productName;
            this.productPrice = productPrice;
            this.category = category;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public float getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(float productPrice) {
            this.productPrice = productPrice;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }


        public void displayDataProduct() {
            System.out.println("Product{" +
                    "productId=" + productId +
                    ", productName='" + productName + '\'' +
                    ", productPrice=" + productPrice +
                    ", category='" + category + '\'' +
                    '}');
        }

        public void inputDataProduct() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập ID sản phẩm: ");
            this.productId = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm: ");
            this.productName = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm (đơn vị: VNĐ/ sp): ");
            this.productPrice = Float.parseFloat(scanner.nextLine());
            System.out.println("Nhập danh mục: ");
            this.category = scanner.nextLine();


        }
    }

