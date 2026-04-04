public class auto extends vehiculo{
    public void registrarauto(String n_placa, String n_marca) throws VehiculoNoAutorizadoException{
        super.setplaca(n_placa);
        super.setmarca(n_marca);
    }

    @Override
    public void setvalorPeaje(double n_vp) throws VehiculoNoAutorizadoException{
        super.setvalorPeaje(1.5);
    }
}