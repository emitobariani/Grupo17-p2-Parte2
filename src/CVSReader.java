import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

public class CVSReader {

    public static void leerArchivoCSV(String rutaArchivo) {
        try (FileReader reader = new FileReader(rutaArchivo);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("id", "user_name", "user_location", "user_description", "user_created", "user_followers", "user_friends", "user_favourites", "user_verified", "date", "text", "hashtags", "source", "is_retweet"))) {
            csvParser.iterator().next();
            for (CSVRecord csvRecord : csvParser) {
                // Obtener información de las columnas
                String id = csvRecord.get("id");
                String userName = csvRecord.get("user_name");
                String userLocation = csvRecord.get("user_location");
                String userDescription = csvRecord.get("user_description");
                String userCreated = csvRecord.get("user_created");
                String userFollowers = csvRecord.get("user_followers");
                String userFriends = csvRecord.get("user_friends");
                String userFavourites = csvRecord.get("user_favourites");
                String userVerified = csvRecord.get("user_verified");
                String date = csvRecord.get("date");
                String text = csvRecord.get("text");
                String hashtags = csvRecord.get("hashtags");
                String source = csvRecord.get("source");
                String isRetweet = csvRecord.get("is_retweet");

                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime fecha = null;
                if (isValidDate(date, formato)) {
                    fecha = LocalDateTime.parse(date, formato);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isValidDate(String date, DateTimeFormatter format) {
        try {
            LocalDateTime.parse(date, format);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }

    }
}
