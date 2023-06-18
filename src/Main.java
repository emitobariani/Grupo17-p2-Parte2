import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String rutaArchivo = "C:\\Users\\azael\\Desktop\\obligatorio2023\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();

        //cvs.leerArchivoCSV(rutaArchivo);
        String rutaDrivers = "C:\\Users\\azael\\Desktop\\obligatorio2023\\drivers.txt";

        txtReader t = new txtReader();
        t.txtreader(rutaDrivers);



    }
}