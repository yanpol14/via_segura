public class auto extends vehiculo{
    public void registrarauto(String n_placa, String n_marca){
        super.setplaca(n_placa);
        super.setmarca(n_marca);
    }

    @Override
    public void setvalorPeaje(double n_vp){
        n_vp = 1.5;
    }
}