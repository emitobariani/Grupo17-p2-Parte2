import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CVSReader {

    public static void leerArchivoCSV(String rutaArchivo) {
        try (FileReader reader = new FileReader(rutaArchivo);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("id", "user_name", "user_location", "user_description", "user_created", "user_followers", "user_friends", "user_favourites", "user_verified", "date", "text", "hashtags", "source", "is_retweet"))) {

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



                // Realizar operaciones con los valores de cada fila
                System.out.println("ID: " + id);
                System.out.println("User Name: " + userName);
                System.out.println("User Location: " + userLocation);
                System.out.println("User Description: " + userDescription);
                System.out.println("User Created: " + userCreated);
                System.out.println("User Followers: " + userFollowers);
                System.out.println("User Friends: " + userFriends);
                System.out.println("User Favourites: " + userFavourites);
                System.out.println("User Verified: " + userVerified);
                System.out.println("Date: " + date);
                System.out.println("Text: " + text);
                System.out.println("Hashtags: " + hashtags);
                System.out.println("Source: " + source);
                System.out.println("Is Retweet: " + isRetweet);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
