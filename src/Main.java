import uy.edu.um.prog2.adt.Entities.HashTag;
import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.Entities.User;
import uy.edu.um.prog2.adt.LeerCSV;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws IOException {
        String rutaArchivo = "C:\\Users\\Emiliano\\Desktop\\data\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();

        //cvs.leerArchivoCSV(rutaArchivo);
        String rutaDrivers = "C:\\Users\\Emiliano\\Desktop\\data\\drivers.txt";

        txtReader t = new txtReader();
        HashMap<String, Integer> drivers = t.txtreader(rutaDrivers);
        LeerCSV l = new LeerCSV();

        l.leerCSV();
        System.out.println(l.getUsers().size());

        //System.out.println(drivers.getSize());

        //System.out.println(drivers.get("Max Verstappen"));

        //drivers.plusOne("Max Verstappen");

        //System.out.println(drivers.get("Max Verstappen"));
        /*Lista<HashTag> hashTags = new ListaEnlazada<>();
        HashTag h = new HashTag(123,"hola", LocalDate.of(2020,10,10));
        HashTag h2 = new HashTag(3,"hola", LocalDate.of(2020,10,10));
        HashTag h3 = new HashTag(9999,"hola", LocalDate.of(2020,10,10));
        hashTags.add(h);
        hashTags.add(h3);
        System.out.println(hashTags.contains(h2));
        System.out.println(hashTags.getNodo(h2).getId());*/




    }
}