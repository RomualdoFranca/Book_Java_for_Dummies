package tryOut.tabelaNutricional;

public class AppTabelaNutricional {

    public static void main(String[] args) {

        TabelaNutricional tabelaBanana = new TabelaNutricional();

        tabelaBanana.nomeAlimento = "Banana";
        tabelaBanana.pesoAlimento = 50;
        tabelaBanana.valorCaloricoTotal = 45.0;
        tabelaBanana.display();

    }


}