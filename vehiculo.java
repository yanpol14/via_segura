public class vehiculo {
    private String placa;
    private String marca;
    private double valorpeaje;

    public void setplaca(String n_placa) {
        if (n_placa == null || n_placa.isEmpty()) {
            System.out.println("ERROR: Placa no válida");
        } else {
            this.placa = n_placa;
        }
    }

    public void setmarca(String n_marca) {
        if (n_marca == null || n_marca.isEmpty()) {
            System.out.println("ERROR: Marca no válida");
        } else {
            this.marca = n_marca;
        }
    }

    public void setvalorPeaje(double n_vp) {
        if (n_vp < 0) {
            System.out.println("ERROR: El peaje no puede ser negativo");
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