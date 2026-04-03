// Archivo: vehiculo.java
public abstract class vehiculo implements Cobrador {
    private String placa;
    private String marca;

    // Constructor base
    public vehiculo() {
    }

    // Getters y Setters (Encapsulamiento total)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws VehiculoNoAutorizadoException {
        if (placa == null || placa.isEmpty()) {
            throw new VehiculoNoAutorizadoException("Error: La placa no puede estar vacía.");
        }
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // El método de la interfaz
    @Override
    public double calcularImpuesto() {
        return getValorPeaje();
    }

    public abstract double getValorPeaje();

    public void reporte() {
        System.out.println("---------- REPORTE -------------");
        System.out.println("La placa de N°: " + placa);
        System.out.println("Marca de vehiculo: " + marca);
        System.out.println("Impuesto: " + calcularImpuesto());
    }
}