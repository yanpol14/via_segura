public class camion extends vehiculo {
    private int nejes; // Primitivo
    private Double valorEje = 2.5; // Wrapper

    public camion() {
    }

    public void setNejes(int nejes) {
        this.nejes = Math.max(nejes, 3); // Validación básica
    }

    @Override
    public double getValorPeaje() {
        return nejes * valorEje;
    }
}