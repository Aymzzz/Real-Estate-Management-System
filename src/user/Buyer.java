package user;

public class Buyer extends User {
    private double budget;

     public Buyer(int id, String name, int age, String email, String phone, double budget) {
        super(id, name, age, email, phone);
        this.budget = budget;  
    }

    public void placeBid() {
    }

    public double getBudget() {
        return budget;
    }

    public void buyProperty() {
    }

    public void proceedPayment() {

         System.out.println("Payment of $" + amount + " processed.");
    }
}
