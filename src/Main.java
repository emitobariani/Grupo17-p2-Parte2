import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.F1Betting;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.txtReader;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        /*String rutaArchivo = "C:\\Users\\Emiliano\\Desktop\\data\\f1_dataset_test.csv";
        CVSReader cvs = new CVSReader();*/

       /* //cvs.leerArchivoCSV(rutaArchivo);
        String rutaDrivers = "C:\\Users\\Emiliano\\Desktop\\data\\drivers.txt";

        txtReader t = new txtReader();
        HashMap<String, Integer> drivers = t.txtreader(rutaDrivers);*/
        /*LeerCSV l = new LeerCSV();

        l.leerCSV();
        System.out.println(l.getUsers().size())*/;

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
        /*String texto = " Este tweet tiene el apellido Vries";
        Tweet t1 = new Tweet(1,texto,"apple", LocalDate.of(2022,12,12),true);
        Set<String> keys = drivers.getKeys();
        for(String key : keys){
            String[] parts = key.split(" ");
            String name = parts[0];
            String lastName = parts[1];
            if(lastName.equals("de")){lastName = parts[2];} //funcion para obtener el apellido de Nyck de Vries
            if(t1.getContent().contains(lastName)){
                System.out.println("El apellido del tweet es: " + lastName);
            }else{
                System.out.println("El apellido del tweet no es: " + lastName);
            }
            //System.out.println(lastName);

        }*/
        F1Betting f1 = new F1Betting();
        f1.topDrivers();





    }
}