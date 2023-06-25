package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.Algoritmos.Quicksort;
import uy.edu.um.prog2.adt.Entities.Driver;
import uy.edu.um.prog2.adt.Entities.HashTag;
import uy.edu.um.prog2.adt.Entities.Tweet;
import uy.edu.um.prog2.adt.Entities.User;
import uy.edu.um.prog2.adt.TADs.ArbolBinario.ArbolBinarioBusqueda;
import uy.edu.um.prog2.adt.TADs.ArbolBinario.ArbolBinarioBusquedaImpl;
import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

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

    public void top10DriversByMenciones (int month, int year){
        Lista<Driver> top;
            for (int j = 0; j < tweetLista.size(); j++) {
                Tweet tweet = tweetLista.get(j);
                if(tweet.getDate() == null){
                    continue;
                }else {
                    LocalDate date = tweet.getDate();
                    int m = date.getMonthValue();
                    int y = date.getYear();
                    if(m == month && y == year){
                        for (int i = 0; i < drivers.size(); i++) {
                            Driver driver = drivers.get(i);
                            if (tweet.getContent().contains(driver.getName())){
                                driver.addMencion();
                            }
                        }

                    }
                }
            }

        Quicksort sort = new Quicksort();

        top = sort.quickSort(getDrivers());
        for (int i = 0; i < 10; i++) {
            System.out.println(top.get(i).getName() + " " + top.get(i).getMenciones());
        }






    }

    public void impimirContent(){
        for (int i = 0; i < tweetLista.size(); i++) {
            System.out.println(tweetLista.get(i).getContent());
        }
    }
}




