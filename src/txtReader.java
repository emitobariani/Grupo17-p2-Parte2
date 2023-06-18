import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class txtReader {

    public HashMap<String, String> txtreader() throws FileNotFoundException {

        HashMap<String, String> hashMap = new HashMap<>();

        String rutaArchivo = "C:\\Users\\ebari\\OneDrive\\Desktop\\test\\drivers.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null){

                hashMap.add(linea, null);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return hashMap;
    }

}
