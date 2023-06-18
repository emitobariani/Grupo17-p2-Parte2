import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.*;
import java.util.Scanner;

public class txtReader {

    public void txtreader(String rutaArchivo) throws FileNotFoundException {
        File file = new File(rutaArchivo);
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }


}
