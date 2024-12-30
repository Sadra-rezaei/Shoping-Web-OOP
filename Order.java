import java.util.ArrayList;

public class Order {
    private int totalPrice;
//    private int orderID;
    private Payment payment;
    private ArrayList<Product> cart;

    public Order(Payment payment) {
        totalPrice = 0;
        this.payment = payment;
        cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setTotalPrice(int price) {
        this.totalPrice += price;
    }

    public int getTotalPrice() {
        for (Product product : cart) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }



}


