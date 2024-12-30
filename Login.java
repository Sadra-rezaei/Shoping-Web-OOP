import java.util.Scanner;

public class Login {
    public void login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Sign Up ======");
        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Email Address: ");
        String email = sc.nextLine();
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        User user = new User(username, firstName, lastName, phoneNumber, email, password);

        System.out.println("\n======================\n  Welcome " + username + "!\n=======================\n\n");
    }
}
