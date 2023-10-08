package AccessorMethods;
import static java.lang.System.out;

public class Account {
    private String name;
    private String address;
    private double balance;

    public void setName(String n) {
        if (!n.equals("")) {
            name = n;

        }else
            out.println("Input a valid name!");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {

        out.printf("Account name: %s\nAccount address: %s\nAccount balance:R$ %.2f\n\n",
                getName(),
                getAddress(),
                getBalance());
    }

}
