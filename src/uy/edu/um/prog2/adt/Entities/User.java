package uy.edu.um.prog2.adt.Entities;

import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.util.Objects;

public class User implements Comparable<User> {
    public User(long id, String name, int favourites, boolean verified) {
        this.id = id;
        this.name = name;
        this.favourites = favourites;
        this.verified = verified;
        this.tweetsList = new ListaEnlazada<>();
    }

    private long id;
    private String name;
    private int favourites;

    private boolean verified;
    private String criterio;

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    private Lista<Tweet> tweetsList = new ListaEnlazada<>();

    public Lista<Tweet> getTweetsList() {
        return tweetsList;
    }

    public void setTweetsList(Lista<Tweet> tweetsList) {
        this.tweetsList = tweetsList;
    }

    public int getFavourites() {
        return favourites;
    }

    public void setFavourites(int favourites) {
        this.favourites = favourites;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }


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

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User u = (User) o;
        return Objects.equals(id, u.getId());
    }

    @Override
    public int compareTo(User o) {
        if(criterio.equals("favoritos")) {
            if (this.favourites > o.getFavourites()) {
                return 1;
            } else if (this.favourites < o.getFavourites()) {
                return -1;
            } else {
                return 0;
            }
        }
        if(criterio.equals("tweets")){
            if (this.tweetsList.size() > o.getTweetsList().size()) {
                return 1;
            } else if (this.tweetsList.size() < o.getTweetsList().size()) {
                return -1;
            } else {
                return 0;
            }
        }else{
            return 0;
        }
    }
}




