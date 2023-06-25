package uy.edu.um.prog2.adt.Entities;

import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;

import java.time.LocalDate;
import java.util.Objects;

public class Tweet {
    public Tweet(long id, String content,LocalDate date, boolean isRetweet, String source) {
        this.id = id;
        this.content = content;
        this.isRetweet = isRetweet;
        this.date = date;
        this.hashTagLista = new ListaEnlazada<>();
        this.source = source;
    }

    private long id;
    private String content;
    private String source;
    private boolean isRetweet;

    private LocalDate date;
    private Lista<HashTag> hashTagLista;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Lista<HashTag> getHashTagLista() {
        return hashTagLista;
    }

    public void setHashTagLista(Lista<HashTag> hashTagLista) {
        this.hashTagLista = hashTagLista;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRetweet() {
        return isRetweet;
    }

    public void setRetweet(boolean retweet) {
        isRetweet = retweet;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof Tweet)) {
            return false;
        }
        Tweet t = (Tweet) o;
        return Objects.equals(content, t.content) && Objects.equals(id, t.getId()) && Objects.equals(isRetweet, t.isRetweet);
    }
}
