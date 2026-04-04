public class camion extends vehiculo implements Cobrador {

    private int nejes;

    public void registrarCamion(String n_placa, String n_marca) throws VehiculoNoAutorizadoException{
        super.setplaca(n_placa);
        super.setmarca(n_marca);
    }

    public void setnejes(int n_ejes) throws VehiculoNoAutorizadoException{
        if (n_ejes >= 2 && n_ejes <= 5) {
            this.nejes = n_ejes;
        } else {
            throw new VehiculoNoAutorizadoException("ERROR: El número de ejes no debe de ser mejor a 2...");
        }
    }

    public int getnejes(){
        return nejes;
    }

    @Override
    public void setvalorPeaje(double n_vp) throws VehiculoNoAutorizadoException{
        super.setvalorPeaje(2.5);
    }

    @Override
    public double calcularImpuesto() {

        double peajePadre = super.getvalorpeaje();
        double impuesto = getnejes() * peajePadre;
        
        return impuesto;
    }

    @Override
    public void reporte() {
    super.reporte();
    System.out.println("Número de ejes: " + getnejes());
    System.out.println("Total Impuesto: " + calcularImpuesto());
}
}