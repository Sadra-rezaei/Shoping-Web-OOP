import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Product> products;
    private ArrayList<Category> categories;
    private int quantity;

    public Inventory(int quantity) {
        this.quantity = quantity;
        this.products = new ArrayList<Product>(quantity);
        this.categories = new ArrayList<Category>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        int size = categories.size();

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        int price = scanner.nextInt();

        System.out.println("Chose product category: ");

        for (int i = 0 ; i < size ; i++ ) {
            int num = i + 1;
            System.out.println(num + ". " + categories.get(i).getName());
        }
        System.out.print("Enter number of category: ");
        int categoryNumber = scanner.nextInt();


        Product product = new Product(name , price , categories.get(categoryNumber) );
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void showCategories() {
        int size = categories.size();
        for (int i = 0; i < size; i++) {
            int num = i + 1;
            System.out.println(num + ". " + categories.get(i).getName());
        }
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }
}
