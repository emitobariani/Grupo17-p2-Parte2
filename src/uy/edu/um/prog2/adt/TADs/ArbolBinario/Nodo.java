package uy.edu.um.prog2.adt.TADs.ArbolBinario;

public class Nodo {

    String key;
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(String key, int item){
        this.key = key;
        valor = item;
        izquierdo = derecho = null;
    }

}
