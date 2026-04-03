import java.io.*;

public class leerCadena {

    public static String lectura() {
        String cadena = null;

        try {
            BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
            cadena = dato.readLine();
        } catch (IOException e) {

        }

        return cadena;
    }
}
