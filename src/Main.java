import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import uy.edu.um.prog2.adt.Entities.Driver;
import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.Entities.User;
import uy.edu.um.prog2.adt.F1Betting;
import uy.edu.um.prog2.adt.LeerCSV;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.Heap.Heap;
import uy.edu.um.prog2.adt.TADs.Heap.MyHeap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;
import uy.edu.um.prog2.adt.txtReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static org.apache.commons.csv.CSVFormat.newFormat;


public class Main {
    public static void main(String[] args) throws IOException {
        Lista<Driver> drivers = new ListaEnlazada<>();
        Driver driver1 = new Driver("lewis hamilton");
        driver1.setMenciones(100);
        Driver driver2 = new Driver("valtteri bottas");
        driver2.setMenciones(50);
        Driver driver3 = new Driver("max verstappen");
        driver3.setMenciones(30);
        Driver driver4 = new Driver("alexander albon");
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);


        Driver[] driversArray = new Driver[drivers.size()];
        for (int i = 0; i < drivers.size(); i++) {
            driversArray[i] = drivers.get(i);
        }
        System.out.println("Drivers sin ordenar");
        for (int i = 0; i < driversArray.length; i++) {
            System.out.println(driversArray[i].getName());
        }
        System.out.println("Drivers ordenados");




    }

    }

