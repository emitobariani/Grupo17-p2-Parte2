import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.Entities.User;
import uy.edu.um.prog2.adt.F1Betting;
import uy.edu.um.prog2.adt.LeerCSV;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
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
        Lista<Tweet> s = new ListaEnlazada<>();
        Tweet t = new Tweet(1,"today is a great day for lewis hamilton",LocalDate.of(2022,10,10),true);
        s.add(t);

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i).getContent().contains("lewis hamilton"));
        }
    }

    }

