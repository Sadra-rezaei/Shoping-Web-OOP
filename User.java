public class User {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String cellPhoneNumber;
    private String address;
//    private Boolean isBlock;
//    private Boolean isSeller;
//    private int wallet;


    public User(String username, String firstName, String lastName, String cellPhoneNumber, String email, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.cellPhoneNumber = cellPhoneNumber;
    }

}
