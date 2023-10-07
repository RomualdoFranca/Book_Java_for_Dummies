package organizations;

import java.util.Scanner;

public class CalculateTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NonProfitOrganization loveAnimals = new NonProfitOrganization();
        ProfitMakingOrganization ondunorte = new ProfitMakingOrganization();

//        loveAnimals.noProfit = scanner.nextBoolean();

        loveAnimals.display();
        ondunorte.display();
    }




}
