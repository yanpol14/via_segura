public class Main{
    public static void main(String[] args){
        
        int op;
        do {

            System.out.println("----- MENÚ VIA-SEGURA. -----");
            System.out.println("[1] Registrar Vehiculo.");
            System.out.println("[2] Reporte de Vehiculos.");
            System.out.println("[3] SALIR...");
            System.out.print("Elija una opcion: ");
            op = Integer.parseInt(leerCadena.lectura());

            switch (op) {
                case 1: {

                    int op1;
                    String placa, marca;

                    do {
                        System.out.println("========= REGISTRAR VEHICULO ======");
                        System.out.println("(1) Auto.");
                        System.out.println("(2) Moto.");
                        System.out.println("(3) Camion.");
                        System.out.println("(4) VOLVER...");
                        System.out.print("Seleccione una opción:");
                        op1 = Integer.parseInt(leerCadena.lectura());

                        auto a = new auto();
                        moto m = new moto();
                        camion c = new camion();

                        switch (op1) {
                            case 1:{

                                System.out.println("********** REGISTRAR AUTO ***************");
                                System.out.println("Ingrese placa: ");
                                placa = leerCadena.lectura();
                                System.out.println("Ingrese marca: ");
                                marca = leerCadena.lectura();
                                
                                a.registrarauto(placa, marca);
                                a.reporte();

                                break;
                                
                            }

                            case 2:{

                                System.out.println("********** REGISTRAR MOTO ***************");
                                System.out.println("Ingrese placa: ");
                                placa = leerCadena.lectura();
                                System.out.println("Ingrese marca: ");
                                marca = leerCadena.lectura();
                                
                                m.registrarmoto(placa, marca);
                                m.reporte();

                                break;
                                
                            }

                            case 3:{

                                System.out.println("********** REGISTRAR CAMION ***************");
                                System.out.println("Ingrese placa: ");
                                placa = leerCadena.lectura();
                                System.out.println("Ingrese marca: ");
                                marca = leerCadena.lectura();
                                
                                c.registrarCamion(placa, marca);
                                c.reporte();

                                break;
                                
                            }
                            
                            case 4:{
                                System.out.print("\nVOLVIENDO AL MENU PRINCIPAL...\n");
                                break;
                            }
                        }

                    } while (op1!=4);
                    break;
                }
            
                case 2:{
                    
                    //FALTA IMPLEMENTAR EL REPORTE DE VEHICULOS Y EL ARRAY
                    break;

                }

                case 3:{
                    System.out.print("\nSALIENDO DEL SISTEMA...\n");
                    break;
                }
            }

        } while (op!=3);        
    }
}