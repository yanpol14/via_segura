public class Main {
    public static void main(String[] args) {

        vehiculo[] vehiculolist = new vehiculo[10];
        int tregistro = 0;
        int op = 0;

        do {
            System.out.println("\n----- MENÚ VIA-SEGURA (" + tregistro + "/10) -----");
            System.out.println("[1] Registrar Vehiculo.");
            System.out.println("[2] Reporte de Vehiculos.");
            System.out.println("[3] SALIR...");
            System.out.print("Elija una opcion: ");

            try {
                op = Integer.parseInt(leerCadena.lectura());
                
                if (op < 1 || op > 3) {
                    System.out.println(" ++++++ OPCION NO ENCONTRADA +++++++");
                    continue; 
                }

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Ingrese una opcion valida."); 
                op = 0; 
                continue; 
            }

            switch (op) {
                case 1: {
                    int op1 = 0, nejes;
                    String placa, marca;

                    do {
                        System.out.println("\n========= REGISTRAR VEHICULO ======");
                        System.out.println("(1) Auto");
                        System.out.println("(2) Moto");
                        System.out.println("(3) Camion");
                        System.out.println("(4) VOLVER...");
                        System.out.print("Seleccione una opción: ");

                        try {
                            op1 = Integer.parseInt(leerCadena.lectura());
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR: Ingrese una opcion valida."); 
                            continue;
                        }

                        if (op1 >= 1 && op1 <= 3 && tregistro >= 10) {
                            System.out.println("!!! Límite de 10 registros alcanzado.");
                            break;
                        }

                        try {
                            switch (op1) {
                                case 1: {
                                    System.out.println("\n********** REGISTRAR AUTO ***************");
                                    System.out.print("Ingrese placa: ");
                                    placa = leerCadena.lectura();
                                    System.out.print("Ingrese marca: ");
                                    marca = leerCadena.lectura();

                                    auto a = new auto();
                                    a.registrarauto(placa, marca);
                                    a.setvalorPeaje(0);
                                    vehiculolist[tregistro] = a; 
                                    tregistro++;
                                    System.out.println("Registro exitoso.");
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n********** REGISTRAR MOTO ***************");
                                    System.out.print("Ingrese placa: ");
                                    placa = leerCadena.lectura();
                                    System.out.print("Ingrese marca: ");
                                    marca = leerCadena.lectura();

                                    moto m = new moto();
                                    m.registrarmoto(placa, marca);
                                    m.setvalorPeaje(0);
                                    vehiculolist[tregistro] = m;
                                    tregistro++; 
                                    System.out.println("Registro exitoso.");
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n********** REGISTRAR CAMION ***************");
                                    System.out.print("Ingrese placa: ");
                                    placa = leerCadena.lectura();
                                    System.out.print("Ingrese marca: ");
                                    marca = leerCadena.lectura();

                                    System.out.print("Ingrese numero de ejes: ");
                                    try {
                                        nejes = Integer.parseInt(leerCadena.lectura());
                                        camion c = new camion();
                                        c.registrarCamion(placa, marca);
                                        c.setnejes(nejes);
                                        c.setvalorPeaje(0);
                                        vehiculolist[tregistro] = c;
                                        tregistro++; 
                                        System.out.println("Registro exitoso.");
                                    } catch (NumberFormatException e) {
                                        System.out.println("ERROR: Ingrese una opcion valida."); 
                                    }
                                    break;
                                }
                            }
                        } catch (VehiculoNoAutorizadoException e) {
                            System.out.println("\n--- REGISTRO CANCELADO ---");
                            System.out.println(e.getMessage());
                        }
                    } while (op1 != 4);
                    break;
                }

                case 2: {
                    System.out.println("\n********** REPORTE DE VEHICULOS ***************");
                    if (tregistro == 0) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        double recaudoTotal = 0;

                        int cantAutos = 0;
                        int cantMotos = 0;
                        int cantCamiones = 0;

                        for (int i = 0; i < tregistro; i++) {
                            System.out.println("\nREGISTRO " + (i + 1) + ":");
                            
                            String tipoVehiculo = "";
                            if (vehiculolist[i] instanceof auto) {
                                tipoVehiculo = "AUTO";
                                cantAutos++;
                            } else if (vehiculolist[i] instanceof moto) {
                                tipoVehiculo = "MOTO";
                                cantMotos++;
                            } else if (vehiculolist[i] instanceof camion) {
                                tipoVehiculo = "CAMION";
                                cantCamiones++;
                            }

                            System.out.println("Tipo: " + tipoVehiculo);
                            System.out.println("Placa: " + vehiculolist[i].getplaca());
                            System.out.println("Marca: " + vehiculolist[i].getmarca());
                            
                            double valorPago = vehiculolist[i].getvalorpeaje();

                            if (vehiculolist[i] instanceof camion) {
                                camion c = (camion) vehiculolist[i];
                                double impuesto = c.calcularImpuesto();
                                System.out.println("Ejes: " + c.getnejes());
                                System.out.println("Peaje Base: $" + valorPago);
                                System.out.println("Impuesto por ejes: $" + impuesto);
                                valorPago += impuesto;
                            }
                            
                            System.out.println("VALOR TOTAL PAGADO: $" + valorPago);
                            recaudoTotal += valorPago;
                        }

                        System.out.println("\n-------------------------------------------");
                        System.out.println("RESUMEN DE REGISTROS:");
                        System.out.println("Autos registrados: " + cantAutos);
                        System.out.println("Motos registradas: " + cantMotos);
                        System.out.println("Camiones registrados: " + cantCamiones);
                        System.out.println("\n-------------------------------------------");
                        System.out.println("TOTAL VEHÍCULOS: " + tregistro);
                        System.out.println("TOTAL RECAUDADO: $" + recaudoTotal);
                        System.out.println("-------------------------------------------");
                    }
                    break;
                }
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        } while (op != 3);
    }
}