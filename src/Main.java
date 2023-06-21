import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String rutaArchivo = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();

        cvs.leerArchivoCSV(rutaArchivo);
        String rutaDrivers = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\drivers.txt";

        txtReader t = new txtReader();
        HashMap<String, Integer> drivers = t.txtreader(rutaDrivers);

        //System.out.println(drivers.getSize());

        System.out.println(drivers.get("Max Verstappen"));

        drivers.plusOne("Max Verstappen");

        System.out.println(drivers.get("Max Verstappen"));


    }
}