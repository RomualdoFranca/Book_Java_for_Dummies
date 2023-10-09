package tryOutPlaceToLive;

import java.util.Scanner;

import static java.lang.System.out;

public class DisplayThePlaces {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PlaceToLive anPlace = new PlaceToLive();
        out.println("Informe o tamanho da área: ");
        anPlace.setSizeArea(scanner.nextDouble());
        out.println(anPlace.getSizeArea());
        double costSquareMeter =  calculateCost(anPlace.getSizeArea(), 10000);
//        out.printf("Cost of square meters: %.2f ", costEsquareMeter);
        out.println("Cost of square meters:" + costSquareMeter);


    }
    static double calculateCost(double sizeArea, double costSquareMeter) {

//        costSquareMeter =  10.000; // valor do metro quadrado
        return sizeArea * costSquareMeter;

    }




}
