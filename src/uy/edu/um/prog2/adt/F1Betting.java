package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.Entities.Driver;
import uy.edu.um.prog2.adt.Entities.HashTag;
import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.Entities.User;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.Heap.Heap;
import uy.edu.um.prog2.adt.TADs.Heap.MyHeap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.io.IOException;
import java.time.LocalDate;

public class F1Betting {

    private Lista<User> userLista;
    private Lista<Tweet> tweetLista;
    private Lista<HashTag> hashtagLista;

    private Lista<Driver> drivers;

    public Lista<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Lista<Driver> drivers) {
        this.drivers = drivers;
    }

    public Lista<User> getUserLista() {
        return userLista;
    }

    public void setUserLista(Lista<User> userLista) {
        this.userLista = userLista;
    }

    public Lista<Tweet> getTweetLista() {
        return tweetLista;
    }

    public void setTweetLista(Lista<Tweet> tweetLista) {
        this.tweetLista = tweetLista;
    }

    public Lista<HashTag> getHashtagLista() {
        return hashtagLista;
    }

    public void setHashtagLista(Lista<HashTag> hashtagLista) {
        this.hashtagLista = hashtagLista;
    }

    public F1Betting() throws IOException {
        String rutaDrivers = "src\\uy\\edu\\um\\prog2\\adt\\drivers.txt";
        String rutaData = "src\\uy\\edu\\um\\prog2\\adt\\f1_dataset_test.csv";
        txtReader t = new txtReader();
        drivers = t.txtreader(rutaDrivers);
        LeerCSV data = new LeerCSV();
        data.leerCSV();
        userLista = data.getUsers();
        tweetLista = data.getTweets();
        hashtagLista = data.getHashTags();
    }

    public void top10DriversByMenciones(int month, int year) {
        Driver driver = null;
        Heap<Driver> top = new Heap<>(false);
        for (int j = 0; j < tweetLista.size(); j++) {
            Tweet tweet = tweetLista.get(j);
            if (tweet.getDate() == null) {
                continue;
            } else {
                LocalDate date = tweet.getDate();
                int m = date.getMonthValue();
                int y = date.getYear();
                if (m == month && y == year) {
                    for (int i = 0; i < drivers.size(); i++) {
                        driver = drivers.get(i);
                        if (tweet.getContent().contains(driver.getName())) {
                            driver.addMencion();
                        }
                    }

                }
            }
        }

        for (int i = 0; i < drivers.size(); i++) {
            top.insert(drivers.get(i));
        }

        for (int i = 0; i < 10; i++) {
            Driver max = top.delete();
            System.out.println("Piloto: " + max.getName() + "  " + " Menciones: " + max.getMenciones());
        }
    }


    public void Top15UsersConMasTweets() {

        MyHeap<User> top = new Heap(false);
        for (int i = 0; i < userLista.size(); i++) {
            User user = userLista.get(i);
            user.setCriterio("tweets");
            top.insert(user);
        }

        for (int i = 0; i < 15; i++) {
            User max = top.delete();

            System.out.println("Usuario: " + max.getName() + "\nCantidad de tweets: " + max.getTweetsList().size()+"\nVerificado: "+(max.isVerified() ? "Si" : "No"));
        }


    }

    public void tweetConFraseOPalabra(String texto){

        int cantidadApariciones = 0;

        for (int i = 0; i < tweetLista.size(); i++) {

            if (tweetLista.get(i).getContent().contains(texto)){
                cantidadApariciones+=1;
            }

        }
        System.out.println("La cantidad de Tweets es:" + cantidadApariciones);
    }

    public void Top7UserFavourites(){

        MyHeap<User> top = new Heap<>(false);
        for(int i = 0; i < userLista.size(); i ++){
            User user = userLista.get(i);
            user.setCriterio("favoritos");
            top.insert(user);
        }



        for(int i = 0; i < 7; i++){
            User max = top.delete();
            System.out.println("Usuario: " + max.getName() + " tiene " + max.getFavourites() +" favoritos");
        }
    }

    public void cantidadDeHashtagsDistintos(int year, int month, int day) {
        int cantidad = 0;
        HashMap<String, Integer> hashTagMap = new HashMap<>();
        for (int i = 0; i < hashtagLista.size(); i++) {
            HashTag hashTag = hashtagLista.get(i);
            if(hashTagMap.get(hashTag.getText()) != null){
                continue;}

            if (hashTag.getDate() == null) {
                continue;
            } else {
                LocalDate date = hashTag.getDate();
                int m = date.getMonthValue();
                int y = date.getYear();
                int d = date.getDayOfMonth();
                if (m == month && y == year && d == day) {
                    hashTagMap.add(hashTag.getText(),1);
                    cantidad++;
                }
            }
        }
        System.out.println("La cantidad de hashtags distintos es: " + cantidad);
    }
    public void hashTagMasUsado(int year, int month, int day) {
        int cantidad = 0;
        String hashTagMasUsado = "";
        HashMap<String, Integer> hashTagMap = new HashMap<>();
        for (int i = 0; i < hashtagLista.size(); i++) {
            HashTag hashTag = hashtagLista.get(i);
            if(hashTag.getText().contains("f1")){
                continue;
            }
            if (hashTag.getDate() == null) {
                continue;
            } else {
                LocalDate date = hashTag.getDate();
                int m = date.getMonthValue();
                int y = date.getYear();
                int d = date.getDayOfMonth();
                if (m == month && y == year && d == day) {
                    if(hashTagMap.get(hashTag.getText()) != null){
                        hashTagMap.add(hashTag.getText(),hashTagMap.getValue(hashTag.getText())+1);
                    }else{
                        hashTagMap.add(hashTag.getText(),1);
                    }
                    if(hashTagMap.getValue(hashTag.getText()) > cantidad){
                        cantidad = hashTagMap.getValue(hashTag.getText());
                        hashTagMasUsado = hashTag.getText();
                    }
                }
            }
        }
        System.out.println("El hashtag mas usado es: " + hashTagMasUsado);
    }
}




