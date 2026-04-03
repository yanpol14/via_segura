public class camion extends vehiculo implements Cobrador {

    private int nejes;

    public void registrarCamion(String n_placa, String n_marca) {
        super.setplaca(n_placa);
        super.setmarca(n_marca);
    }

    public void setnejes(int n_ejes) {
        if (n_ejes >= 2 && n_ejes <= 5) {
            this.nejes = n_ejes;
        } else {
            System.out.println("ERROR: El camión debe tener entre 2 y 5 ejes.");
        }
    }

    @Override
    public void setvalorPeaje(double n_vp) {
        super.setvalorPeaje(2.5); 
    }

    @Override
    public double calcularImpuesto() {

        double peajePadre = super.getvalorpeaje();
        double impuesto = this.nejes * peajePadre;
        
        return impuesto;
    }

    @Override
    public void reporte() {
    super.reporte(); // Llama al reporte del padre (placa, marca, peaje)
    System.out.println("Número de ejes: " + this.nejes);
    System.out.println("Total Impuesto: " + calcularImpuesto());
}
}