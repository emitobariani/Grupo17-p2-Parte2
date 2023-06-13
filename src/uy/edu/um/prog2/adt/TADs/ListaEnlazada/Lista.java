package uy.edu.um.prog2.adt.TADs.ListaEnlazada;

public interface Lista <T>{
    void add(T nodo);
    T get(int index);

    boolean contains(T nodo);

    void remove(T nodo);

    int size();

}
