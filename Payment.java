public class Payment {
    private int cartNumber;
    private int cost;
    private int trackingCode;


    public void pay(){
        System.out.println("You payed " + cost + "$");
    }

    public void setCost(int cost){
        this.cost = cost;
    }
}
