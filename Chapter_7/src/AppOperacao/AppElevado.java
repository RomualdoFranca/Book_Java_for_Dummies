package AppOperacao;

import java.util.Scanner;

public class AppElevado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TemporizadorElevado elevadoBotafogo = new TemporizadorElevado();
        elevadoBotafogo.setNivelTotal(3.8);
        elevadoBotafogo.setNivelAposLavagem(1.47);
        elevadoBotafogo.calcularVolumeFaltante();
        System.out.printf("Volume faltante %.4f\n", elevadoBotafogo.calcularVolumeFaltante());

        System.out.printf("Minutos totais %.1f\n", elevadoBotafogo.calcularMinutosTotais());
        System.out.printf("Tempo total para encher o elevado: %.1f horas e %.1f minutos\n",
                elevadoBotafogo.converterEmHoras(elevadoBotafogo.calcularMinutosTotais()),
                elevadoBotafogo.calcularMinutosRestante());

        scanner.close();
    }

}
