package uy.edu.um.prog2.adt.Entities;

import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;

public class User {
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private long id;
    private String name;

    private int favourites;

    private boolean verified;

    private Lista<Tweet> tweetLista;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
