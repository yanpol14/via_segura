public class vehiculo {
    private String placa;
    private String marca;
    private double valorpeaje;

    public void setplaca(String n_placa) throws VehiculoNoAutorizadoException {
        if (n_placa == null || n_placa.trim().isEmpty()) { 
            throw new VehiculoNoAutorizadoException("ERROR: La placa no puede estar vacía o contener solo espacios.");
        } else {
            this.placa = n_placa;
        }
    }

    public void setmarca(String n_marca) throws VehiculoNoAutorizadoException {
        if (n_marca == null || n_marca.isEmpty()) {
            throw new VehiculoNoAutorizadoException("ERROR: La Marca no puede estar vacía o contener solo espacios.");
        } else {
            this.marca = n_marca;
        }
    }

    public void setvalorPeaje(double n_vp) throws VehiculoNoAutorizadoException {
        if (n_vp < 0) {
            throw new VehiculoNoAutorizadoException("ERROR: El peaje no debe de ser menor que cero ni negativo");
        } else {
            this.valorpeaje = n_vp;
        }
    }

    public String getplaca() { return placa; }
    public String getmarca() { return marca; }
    public double getvalorpeaje() { return valorpeaje; }

    public void reporte(){
        System.out.println("\n---- REPORTE DE ["+getplaca()+"] ----\n");
        System.out.println("Vehiculo de placa: " + getplaca());
        System.out.println("Vehiculo de marca: " + getmarca());
        System.out.println("Valor de peaje de: " + getvalorpeaje());
    }
}