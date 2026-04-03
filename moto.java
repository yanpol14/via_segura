public class moto extends vehiculo{
    public void registrarmoto(String n_placa, String n_marca){
        super.setplaca(n_placa);
        super.setmarca(n_marca);
    }

    @Override
    public void setvalorPeaje(double n_vp){
        n_vp = 0.5;
    }
}