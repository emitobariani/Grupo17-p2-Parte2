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
        // revisando memoria
        String rutaData =  "src\\uy\\edu\\um\\prog2\\adt\\f1_dataset_test.csv";
        String rutaDrivers = "src\\uy\\edu\\um\\prog2\\adt\\drivers.txt";
        F1Betting f1Betting = new F1Betting(rutaData, rutaDrivers);
        //revisando memoria de la funcion 1
        long startTime = System.nanoTime();
        f1Betting.top10DriversByMenciones(11,2021);
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
        //revisando memoria de la funcion 2
        //while(true){f1Betting.Top15UsersConMasTweets();}
        //revisando memoria de la funcion 3
        //while(true){f1Betting.cantidadDeHashtagsDistintos(2021,10,12);}
        //revisando memoria de la funcion 4
        //while(true){ f1Betting.hashTagMasUsado(2021,12,10);}
        //revisando memoria de la funcion 5
        //while(true){f1Betting.Top7UserFavourites();}
        //revisando memoria de la funcion 6
        //while(true){f1Betting.tweetConFraseOPalabra("ferrari");}




    }

    }

