import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.*;
import java.util.Scanner;

public class txtReader {

    public void txtreader(String rutaArchivo) throws FileNotFoundException {
        File file = new File(rutaArchivo);
        Scanner scan = new Scanner(file);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        while(scan.hasNextLine()){
            hashMap.add(scan.nextLine(), 0);
        }
        System.out.println(hashMap.get("Kevin Magnussen"));
    }


}
