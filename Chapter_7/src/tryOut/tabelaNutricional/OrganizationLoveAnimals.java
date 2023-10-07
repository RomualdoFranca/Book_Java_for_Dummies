package tryOut.tabelaNutricional;
import static java.lang.System.out;

public class OrganizationLoveAnimals {

    // venda de produtos, campanhas
    double revenue;

    double expenses;
    // informacoes sobre os doadores
    double donations;
    String rescuedAnimal;
    String adoptions;
    public boolean profitMaking;

    public void display() {

        out.println("Non profit organization? " + profitMaking);
        out.println("Organization's monthly revenue: R$" + revenue);
    }
}
