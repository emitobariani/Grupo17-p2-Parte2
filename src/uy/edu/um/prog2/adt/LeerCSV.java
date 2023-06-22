package uy.edu.um.prog2.adt;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import uy.edu.um.prog2.adt.Entities.HashTag;
import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.Entities.User;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class LeerCSV {

    private Lista<User> users = new ListaEnlazada<>();
    private Lista<HashTag> hashTags = new ListaEnlazada<>();
    private Lista<Tweet> tweets = new ListaEnlazada<>();

    private String ruta = "C:\\Users\\Emiliano\\Desktop\\data\\f1_dataset_test.csv";

    public Lista<User> getUsers() {
        return users;
    }

    public void setUsers(Lista<User> users) {
        this.users = users;
    }

    public Lista<HashTag> getHashTags() {
        return hashTags;
    }

    public void setHashTags(Lista<HashTag> hashTags) {
        this.hashTags = hashTags;
    }

    public Lista<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(Lista<Tweet> tweets) {
        this.tweets = tweets;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public  void leerCSV() throws IOException {

        String SAMPLE_CSV_FILE_PATH = this.ruta;
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            csvParser.iterator().next();
            for (CSVRecord csvRecord : csvParser) {
                // Accedemos a los valores del archivo CSV
                Long id = Long.parseLong(csvRecord.get(0));

                String userName = csvRecord.get(1);

                String userLocation = csvRecord.get(2);

                String userDescription = csvRecord.get(3);

                String userFollowers = csvRecord.get(5);

                String userFriends = csvRecord.get(6);

                Integer userFavourites = 0;

                boolean userVerified = Boolean.parseBoolean(csvRecord.get(8));

                String text = csvRecord.get(10);

                String hashtagValues = csvRecord.get(11).replaceAll("[\\[\\]]", "").replaceAll("'", "");

                String[] hashtags = hashtagValues.split(",");

                String source = csvRecord.get(12);

                boolean isRetweet = Boolean.parseBoolean(csvRecord.get(13));

                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                LocalDate fecha = null;

                LocalDate fechaUsuario = null;

                String date = csvRecord.get(9);

                String[] dateParts = date.split(" ");

                String tweetDateDay = dateParts[0];

                if (isValidDate(tweetDateDay, formatoFecha)) {
                    fecha = LocalDate.parse(tweetDateDay, formatoFecha);
                }

                String userCreated = csvRecord.get(4);

                String[] userCreatedParts = userCreated.split(" ");

                String userCreatedDate = userCreatedParts[0];

                if (isValidDate(userCreatedDate, formatoFecha)) {
                    fechaUsuario = LocalDate.parse(userCreatedDate, formatoFecha);
                }

                if(isValidFloat(csvRecord.get(7))){
                    userFavourites = Math.round(Float.parseFloat(csvRecord.get(7)));
                }

                User user = new User(id,userName,userFavourites,userVerified);

                Tweet tweet = new Tweet(id,text,source,fecha,isRetweet);

                for (int i = 0; i < hashtags.length; i++) {
                    HashTag hashTag = new HashTag(id,hashtags[i],fecha);
                    tweet.getHashTagLista().add(hashTag);
                    hashTags.add(hashTag);
                }

                tweets.add(tweet);

                if(users.contains(user)){
                    user = users.getNodo(user);
                    user.getTweetLista().add(tweet);
                }else{
                    user.getTweetLista().add(tweet);
                    users.add(user);
                }



                /*System.out.println("id : " + id);
                System.out.println("Name : " + userName);
                System.out.println("Location : " + userLocation);
                System.out.println("Desc : " + userDescription);
                System.out.println("Created : " + fechaUsuario);
                System.out.println("Followers : " + userFollowers);
                System.out.println("Friends : " + userFriends);
                System.out.println("Favourites : " + userFavourites);
                System.out.println("Verified : " + userVerified);
                System.out.println("Date : " + fecha);
                System.out.println("Text : " + text);
                System.out.println("Hashtags : " + hashtags[0]);
                System.out.println("Source : " + source);
                System.out.println("Retweet : " + isRetweet);
                System.out.println("\n\n");*/

            }
        }


    }

    private static boolean isValidDate(String date, DateTimeFormatter format) {
        try {
            LocalDate.parse(date, format);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }


    private static boolean isValidFloat(String number){
        try{
            Float.parseFloat(number);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

}
