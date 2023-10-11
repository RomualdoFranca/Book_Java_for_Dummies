package AppOperacao;

public class TemporizadorElevado {

    private  double nivelTotal;
    private double nivelAposLavagem;

    public double getNivelTotal() {
        return nivelTotal;
    }

    public void setNivelTotal(double nivelTotal) {
        this.nivelTotal = nivelTotal;
    }

    public double getNivelAposLavagem() {
        return nivelAposLavagem;
    }

    public void setNivelAposLavagem(double nivelAposLavagem) {
        this.nivelAposLavagem = nivelAposLavagem;
    }
    public double calcularVolumeFaltante() {
        return nivelTotal - nivelAposLavagem;
    }
    public double calcularMinutosTotais() {
        return calcularVolumeFaltante() / 0.016;
    }

    public double converterEmHoras(double horas) {


        if (calcularMinutosTotais() >= 60.0) {
            horas = calcularMinutosTotais() - (calcularMinutosTotais() % 60.0);
            if (horas % 60 == 0) {
                horas /= 60;
            }
        }else
            return calcularMinutosTotais();

        return horas;
    }
    public double calcularMinutosRestante() {
        return calcularMinutosTotais() % 60;
    }
}
