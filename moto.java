public class moto extends vehiculo {
    private Double tarifaFija;

    public moto() {
        this.tarifaFija = 3.0;
    }

    @Override
    public double getValorPeaje() {
        return tarifaFija;
    }
}