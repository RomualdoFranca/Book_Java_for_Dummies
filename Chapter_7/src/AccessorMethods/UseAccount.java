package AccessorMethods;
import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class UseAccount {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream accountData = new PrintStream("accountDataFile.txt");

        Account myAccount = new Account();
        Account yourAccount = new Account();


        myAccount.setName("Romualdo");
        myAccount.setAddress("Rua das casas, N° das portas");
        myAccount.setBalance(2000.00);

        myAccount.display();

        yourAccount.setName("Puga");
        yourAccount.setAddress("Rua Sem Nome, N° 0");
        yourAccount.setBalance(10.00);

        out.printf("Account name: %s\nAccount address: %s\nAccount balance:R$ %.2f\n\n",
                yourAccount.getName(),
                yourAccount.getAddress(),
                yourAccount.getBalance());
    }
}
