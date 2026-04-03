import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<vehiculo> listaVehiculos = new ArrayList<>();
        double totalRecaudado = 0;

        System.out.println("------- SIMULADOR VIA-SEGURA (Registro de 10 vehículos) ---------");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nVehículo N° " + i);
            System.out.println("[1] Auto | [2] Moto | [3] Camion");
            int op = Integer.parseInt(leerCadena.lectura());

            vehiculo v;
            if (op == 1)
                v = new auto();
            else if (op == 2)
                v = new moto();
            else
                v = new camion();

            try {
                System.out.print("Ingrese N° placa: ");
                v.setPlaca(leerCadena.lectura());
                System.out.print("Ingrese marca: ");
                v.setMarca(leerCadena.lectura());

                if (v instanceof camion) {
                    System.out.print("Ingrese N° de ejes: ");
                    ((camion) v).setNejes(Integer.parseInt(leerCadena.lectura()));
                }

                listaVehiculos.add(v);
            } catch (VehiculoNoAutorizadoException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println("\n======= RECAUDACIÓN DEL DÍA =======");
        for (vehiculo veh : listaVehiculos) {
            veh.reporte();
            totalRecaudado += veh.calcularImpuesto();
        }

        System.out.println("\nTOTAL RECAUDADO POR DÍA: " + totalRecaudado);
    }
}