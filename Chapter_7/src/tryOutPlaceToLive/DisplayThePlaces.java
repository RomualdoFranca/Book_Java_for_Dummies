package tryOutPlaceToLive;

import java.util.Scanner;

import static java.lang.System.out;

public class DisplayThePlaces {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PlaceToLive aPlace = new PlaceToLive();

        out.println("Enter the size of the area: ");
        aPlace.setSizeArea(scanner.nextInt());

        out.println("Enter the number of bedrooms");
        aPlace.setNumberBedrooms(scanner.nextInt());

        out.println("Provide the address");
        aPlace.setAddress(scanner.next());

        PlaceToLive resort = new PlaceToLive();

        resort.setAddress("Av. Boa Viagem");
        resort.setSizeArea(150);
        resort.setNumberBedrooms(10);

        out.println("Please provide the cost of living in this location");
        double costOfLiving = scanner.nextDouble();

        calculateCostSquareMeter(costOfLiving ,resort.getSizeArea());

//        double costBedroom =  calculateCostSquareMeter();


    }
    static double calculateCostSquareMeter(double costOfLiving, int sizeArea) {
//        costOfLiving =  10.000; // valor do metro quadrado
        return costOfLiving / sizeArea;

    }

}


//        out.println("Enter the size of the area: ");
//        infoPlace.setSizeArea(scanner.nextDouble());
//
//
//        out.println("Enter the number of bedrooms");
//        infoPlace.setNumberBedrooms(scanner.nextInt());
//
//        out.println("Provide the address");
//        infoPlace.setAddress(scanner.nextLine());
