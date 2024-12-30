import java.util.ArrayList;
import java.util.Scanner;

public class WebsiteUI {
    private Inventory inventory;
    private Order order;
    private Payment payment;

    public void display(Inventory inventory, Order order , Payment payment) {
        this.inventory = inventory;
        this.order = order;
        this.payment = payment;
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int productCounter;
        int productCardChoice;
        ArrayList<Product> productsForBuy = new ArrayList<>();

        System.out.print("============\n  Sadikala  \n============");

        do {
            System.out.println("\n1. Show Categories");
            System.out.println("2. Show Orders/Card");
            System.out.println("3. Show Products");
//            System.out.println("4. Search");
//            System.out.println("5. User Account");
            System.out.println("10. Exit\n");

            System.out.print("==== Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    productCounter = 0; //for counting products
                    int categoryChoice; //for Category choice
                    int productChoice;
                    productsForBuy.clear();

                    do {    //Category ==================
                        System.out.println("\n\n0. === Back to main page ===");
                        inventory.showCategories();
                        System.out.print("\nChose a category: ");
                        categoryChoice = scanner.nextInt();

                        if (categoryChoice == 0) {
                            break;  // for Category

                        } else {
                            do {
                                System.out.println("\n\n0. === Back to category page ===");
                                for (Product product : inventory.getProducts()) {
                                    if (inventory.getCategories().get(categoryChoice - 1).equals(product.getCategory())) {
                                        productCounter++;
                                        System.out.println(productCounter + ". " + product.getName() + "          " + product.getPrice() + "$");
                                        productsForBuy.add(product); //search results
                                    }
                                }
                                System.out.println("\n=== What do you want to buy? ===: ");// productUI ======================
                                productChoice = scanner.nextInt();
                                if (productChoice != 0) {
                                    order.addToCart(productsForBuy.get(productChoice - 1));
                                    System.out.println("\n=== Product added to Cart ===");
                                }
                                productCounter = 0;


                            } while (productChoice != 0);
                            productsForBuy.clear();
                        }
                    } while (categoryChoice != 0);
                    break; //for case 1

                case 2:
                    productCounter = 0;
                    productCardChoice = 0;
//                    int totalPrice = 0;

                    System.out.println("\n\n0. === Back to main page ===\n=== Your cart ===\n");
                    for (productCounter = 0; productCounter < order.getCart().size(); productCounter++) {
                        System.out.println((productCounter + 1) + ". " + order.getCart().get(productCounter).getName() + "           " + order.getCart().get(productCounter).getPrice() + "$");
                        order.getTotalPrice();

                    }


                    productCounter ++;
                    System.out.println((productCounter) + "=== Pay ===: ");

                    System.out.println("\n=== What do you want? ===: ");
                    productCardChoice = scanner.nextInt();
                    if (productCardChoice == 0) {
                        break;
                    }
                    else {
                        payment.setCost(order.getTotalPrice());
                        payment.pay();
                        order.getCart().clear();
                    }
                    break;

                case 3:
                    productCounter = 0;
                    productCardChoice = 0;
                    productsForBuy.clear();

                    System.out.println("\n\n0. === Back to main page ===");
                    for (productCounter = 0; productCounter < inventory.getProducts().size(); productCounter++) {
                        System.out.println((productCounter + 1) + ". " + inventory.getProducts().get(productCounter).getName() + "          " + inventory.getProducts().get(productCounter).getPrice() + "$     Category: " + inventory.getProducts().get(productCounter).getCategory().getName());

                    }

                    System.out.println("\n=== What do you want? ===: ");
                    productCardChoice = scanner.nextInt();

                    while (productCardChoice != 0) {
                        order.getCart().add(inventory.getProducts().get(productCardChoice - 1));
                        System.out.println("\n=== Product added to Card ===\n=== Any thing else? (Enter 0 to exit) ===: ");
                        productCardChoice = scanner.nextInt();
                    }
                    break;









            }

        } while (choice != 10);



    }
}
