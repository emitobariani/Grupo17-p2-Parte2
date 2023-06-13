package uy.edu.um.prog2.adt.TADs.ListaEnlazada;

import uy.edu.um.prog2.adt.TADs.Exceptions.EmptyQueueException;
import uy.edu.um.prog2.adt.TADs.Exceptions.EmptyStackException;
import uy.edu.um.prog2.adt.TADs.Queue.Queue;
import uy.edu.um.prog2.adt.TADs.Stack.Stack;

public class ListaEnlazada<T> implements Queue<T>, Stack<T>, Lista<T> {

    private Node<T> first, last = null;
    public ListaEnlazada(){
    }


    @Override
    public void add(T nodo) {
        if (nodo != null) {
            Node<T> nuevoNodo = new Node<>(nodo);
            if (this.first == null) {
                this.first = nuevoNodo;
                this.last = nuevoNodo;
            } else {
                this.last.setNext(nuevoNodo);
                this.last = nuevoNodo;
            }
        }

    }
    public void addToTheBeginning(T nodo){
        if (nodo != null) {
            Node<T> nuevoNodo = new Node(nodo);
            if (this.first == null) {
                this.first = nuevoNodo;
                this.last = nuevoNodo;
            } else {
                nuevoNodo.setNext(this.first);
                this.first = nuevoNodo;
            }
        }
    }

    @Override
    public T get(int index) {
        T value = null;
        int position = 0;
        Node<T> aux;
        for(aux = this.first; aux != null && position != index; ++position) {
            aux = aux.getNext();
        }
        if(position==index){value = aux.getValue();}

        return value;
    }

    @Override
    public void remove(T nodo) {
        Node<T> nodoAnterior = null;

        Node nodoBuscado;
        for(nodoBuscado = this.first; nodoBuscado != null && !nodoBuscado.getValue().equals(nodo); nodoBuscado = nodoBuscado.getNext()) {
            nodoAnterior = nodoBuscado;
        }

        if (nodoBuscado != null) {
            if (nodoBuscado == this.first && nodoBuscado != this.last) {
                Node<T> aux = this.first;
                this.first = this.first.getNext();
                aux.setNext(null);
            } else if (nodoBuscado == this.last && nodoBuscado != this.first) {
                nodoAnterior.setNext(null);
                this.last = nodoAnterior;
            } else if (nodoBuscado == this.last && nodoBuscado == this.first) {
                this.first = null;
                this.last = null;
            } else {
                nodoAnterior.setNext(nodoBuscado.getNext());
                nodoBuscado.setNext(null);
            }
        }

    }

    public T removeLastElement(){
        T nodoRemovido = null;
        if (this.last != null) {
            nodoRemovido = this.last.getValue();
            this.remove(nodoRemovido);
        }
        return nodoRemovido;
    }


    @Override
    public void enqueue(T nodo) {
        this.addToTheBeginning(nodo);

    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if(this.last==null){
            throw new EmptyQueueException();
        }else{return this.removeLastElement();}
    }

    @Override
    public boolean contains(T nodo) {
        boolean contains = false;
        Node<T> aux;
        for(aux = this.first; aux != null && !aux.getValue().equals(nodo);aux = aux.getNext()){
        }
        if(aux !=null){
            contains = true;
        }
        return contains;
    }

    @Override
    public void push(T value) {
        this.add(value);

    }

    @Override
    public T pop() throws EmptyStackException {
        if(this.last==null){
            throw new EmptyStackException();
        }else{return this.removeLastElement();}
    }

    @Override
    public T peek() {
        T valor = null;
        if(this.last!=null){valor = this.last.getValue();}
        return valor;
    }

    @Override
    public int size() {
        int size = 0;
        for(Node<T> aux = this.first; aux != null; ++size){
            aux = aux.getNext();
        }
        return size;
    }
}
