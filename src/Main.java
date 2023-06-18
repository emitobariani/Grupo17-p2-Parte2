import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String rutaArchivo = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();

        //cvs.leerArchivoCSV(rutaArchivo);
        String rutaDrivers = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\drivers.txt";

        txtReader t = new txtReader();
        t.txtreader(rutaDrivers);





    }
}