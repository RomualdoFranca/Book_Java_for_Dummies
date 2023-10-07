package organizations;

import java.util.Scanner;

import static java.lang.System.out;

public class CalculateTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RescueAnimalsOrganization loveAnimals = new RescueAnimalsOrganization();
        BpwOrganization ondunorte = new BpwOrganization();

//        loveAnimals.noProfit = scanner.nextBoolean();

        loveAnimals.display();
    }




}
