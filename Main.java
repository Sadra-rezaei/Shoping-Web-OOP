public class Main {
    public static void main(String[] args) {
        Category electronics = new Category("Electronics");
        Category clothes = new Category("Clothes");
        Category tools = new Category("Tools");
        Login signUp = new Login();
        Payment payment = new Payment();
        Order order = new Order(payment);

        WebsiteUI website = new WebsiteUI();

        Inventory inventory = new Inventory(10);
        inventory.addCategory(electronics);
        inventory.addCategory(clothes);
        inventory.addCategory(tools);

        Product product1 = new Product("Mobile", 499, electronics);
        inventory.getProducts().add(product1);
        Product product2 = new Product("Hammer", 20, tools);
        inventory.getProducts().add(product2);
        Product product3 = new Product("Black T-shirt", 8, clothes);
        inventory.getProducts().add(product3);
        Product product4 = new Product("Neil", 1, tools);
        inventory.getProducts().add(product4);
        Product product5 = new Product("VR headset", 1399, electronics);
        inventory.getProducts().add(product5);
        Product product6 = new Product("Iron Man mark.85", 999999, clothes);
        inventory.getProducts().add(product6);

        signUp.login();
        website.display(inventory , order , payment);

    }
}