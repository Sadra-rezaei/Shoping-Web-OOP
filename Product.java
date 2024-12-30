public class Product {
//    private int productID;
    private String name;
    private int price;
//    private int quantity;
    private Category category;

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
//        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

//    public void productUI() {}

}
