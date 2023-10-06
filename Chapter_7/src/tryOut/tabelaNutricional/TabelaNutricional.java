package tryOut.tabelaNutricional;
import static java.lang.System.out;

public class TabelaNutricional {


   // buscar dados dos mercados locais baseado na localizao do usuario. Produtos disponiveis para realizacao da dieta
    String nomeAlimento;

    // colher, xicara, ml, kg, g, copo
    int pesoAlimento;
    int porcaoPedaco;

    // tipos de atividades fisica, duracao do exercicio, necessaria para queimar as calorias
    // comparacao entre alimentos de mesmo valor calorico, mas com menor valor de gordura saturada, sodio
    double valorCaloricoTotal;
    double gorduraSaturada;
    double sodio;

 public void display() {

  out.println("Valor nutricional da " + nomeAlimento);
  out.println("Peso do alimento: " + pesoAlimento + "g");
  out.println("Valor calórico: " + valorCaloricoTotal + "kcal");

 }

}
