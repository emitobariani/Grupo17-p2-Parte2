package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.Entities.Driver;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.io.*;
import java.util.Scanner;

public class txtReader {

    public Lista<Driver> txtreader(String rutaArchivo) throws FileNotFoundException {
        File file = new File(rutaArchivo);
        Scanner scan = new Scanner(file);
        Lista<Driver> drivers = new ListaEnlazada<>();
        String driver;

        while(scan.hasNextLine()){
            driver = scan.nextLine().toLowerCase();
            drivers.add(new Driver(driver));
        }
        return drivers;
    }


}
