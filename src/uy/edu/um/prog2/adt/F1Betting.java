package uy.edu.um.prog2.adt;

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
import java.util.Set;

public class F1Betting {

    private Lista<User> userLista;
    private Lista<Tweet> tweetLista;
    private Lista<HashTag> hashtagLista;

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

    public HashMap<String, Integer> getDrivers() {
        return drivers;
    }

    public void setDrivers(HashMap<String, Integer> drivers) {
        this.drivers = drivers;
    }

    private HashMap<String, Integer> drivers;

    public F1Betting() throws IOException {
        String rutaDrivers = "src\\uy\\edu\\um\\prog2\\adt\\drivers.txt";
        String rutaData = "src\\uy\\edu\\um\\prog2\\adt\\f1_dataset_test.csv";
        this.drivers = new HashMap<>();
        this.userLista = new ListaEnlazada<>();
        this.tweetLista = new ListaEnlazada<>();
        this.hashtagLista = new ListaEnlazada<>();
        txtReader t = new txtReader();
        drivers = t.txtreader(rutaDrivers);
        LeerCSV data = new LeerCSV();
        data.setRuta(rutaData);
        data.leerCSV();
        this.userLista = data.getUsers();
        this.tweetLista = data.getTweets();
        this.hashtagLista = data.getHashTags();

    }

    public void topDrivers (){
        Set<String> keys = drivers.getKeys();
        for(String key : keys) {
            String[] parts = key.split(" ");
            String name = parts[0];
            String lastName = parts[1];
            if (lastName.equals("de")) {
                lastName = parts[2];
            } //funcion para obtener el apellido de Nyck de Vries
            System.out.println("Piloto: " + key + " Cantidad de menciones: " + drivers.get(key));

            /*for (int i = 0; i < tweetLista.size(); i++) {
                if (tweetLista.get(i).getContent().contains(name) || tweetLista.get(i).getContent().contains(lastName)) {
                    drivers.plusOne(key);
                }
            }*/


        }
        /*HashMap<Integer,String> top10 = new HashMap<>();
        for(int i = 0; i < 10; i++){
            int max = 0;
            String maxKey = "";
            for(String key : keys){
                if((int)drivers.get(key) > max){
                    max = (int) drivers.get(key);
                    maxKey = key;
                }
            }
            System.out.println("Piloto: " + maxKey + " Cantidad de menciones: " + max );
            //top10.add(max,maxKey);
            drivers.remove(maxKey);*/
        }




    }





