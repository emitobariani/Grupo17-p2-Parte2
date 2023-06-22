package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;

import java.io.*;
import java.util.Scanner;

public class txtReader {

    public HashMap<String, Integer> txtreader(String rutaArchivo) throws FileNotFoundException {
        File file = new File(rutaArchivo);
        Scanner scan = new Scanner(file);
        HashMap<String,Integer> drivers = new HashMap<>();
        String driver;

        while(scan.hasNextLine()){
            driver = scan.nextLine();
            drivers.add(driver,0);
        }
        return drivers;
    }


}
