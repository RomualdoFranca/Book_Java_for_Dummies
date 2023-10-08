package organizations;
import java.util.Scanner;

import static java.lang.System.out;

public class NonProfitOrganization {

    boolean profit;
    double revenue;
    String organizationName;


    // fluxo de controle para o calculo de empresas com ou sem fins lucrativos
    public double getTax() {

        if (profit == true) {
            return revenue * 2/100; // imposto de empresa sem fins lucrativos
        }else
            return revenue * 10/100;// imposto de empresa com fins lucrativos

    }

    // metodo dos inputs e outputs das informacoes
    public void display() {
        Scanner scanner = new Scanner(System.in);

        out.println("What's the organization name? ");
        organizationName = scanner.nextLine();

        out.println("Is this organization for profit? ");
        profit = scanner.nextBoolean();

        out.println("What is the organization's revenue?");
        revenue = scanner.nextDouble();

        out.println("Organization name\n" + organizationName);
        out.printf("Organization monthly revenue\nR$%5.2f\n", revenue);
        out.printf("Monthly tax amount\nR$%2.2f\n", getTax());

    }
}

