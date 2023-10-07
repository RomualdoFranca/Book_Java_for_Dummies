public class Account {

    // instance variables
    String name;
    String address;
    double balance;

    // An Account Displays Itself
    public void display() {
        System.out.println("Client name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
//        System.out.println("Interest per month: R$" + getInterest());

    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100;
    }


}
