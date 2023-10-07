package organizations;
import java.util.Scanner;

import static java.lang.System.out;

public class RescueAnimalsOrganization {

    boolean noProfit;
    double revenue;
    String organizationName;


    // fluxo de controle para o calculo de empresas com ou sem fins lucrativos
    public double getTax() {

        if (noProfit == true) {
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
        noProfit = scanner.nextBoolean();

        out.println("What is the organization's revenue?");
        revenue = scanner.nextDouble();

        out.println("Is this organization for profit? " + noProfit);
        out.printf("Tax amount; R$%.2f", getTax());
    }

}

