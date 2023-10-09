package ReusingExistingCode;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class DoPayroll {
    public static void main(String[] args) throws IOException {

        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
        /*Esse 'for' chama o metodo payOneEmployee 3 vezes
        * O numero da variavel local do 'for' foi definido levando em conta a quantidade de informacoes do arquivo
        * .txt
        * A quantidade de vezes que o metodo pode ser chamado dever ser IGUAL OU MENOR  que a quantidade de informacoes
        * contidas no arqui e NUNCA MAIOR
        *
        *Cada vez que o metodo payOneEmployee é chamado, um novo objeto é criado*/
        for (int empNum = 1; empNum <= 3; empNum++){
            payOneEmployee(diskScanner);
        }
        diskScanner.close();


    }

    // Esse metodo retira informacoes de um arquivo .txt e alimenta as variaveis de instancia da classe Employee

    static void payOneEmployee(Scanner aScanner) {
        Employees anEmployee = new Employees();

        // observar a ordem dos dados no arquivo .txt para nao gerar erro
        anEmployee.setName(aScanner.nextLine()); // pega a string com nome do empregado
        anEmployee.setJobTitle(aScanner.nextLine());// pega a string com cargo do empregado
        // pega o valor do salario(tipo double) do empregado e print com o output definido dentro do metodo cutCheck dentro da classe Employee
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
