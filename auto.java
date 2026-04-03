public class auto extends vehiculo {
    private Double tarifaEstandar;

    public auto() {
        this.tarifaEstandar = 5.0; // Inicializa valor base
    }

    @Override
    public double getValorPeaje() {
        return tarifaEstandar;
    }
}