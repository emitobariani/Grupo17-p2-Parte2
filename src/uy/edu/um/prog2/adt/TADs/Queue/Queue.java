package uy.edu.um.prog2.adt.TADs.Queue;

import uy.edu.um.prog2.adt.TADs.Exceptions.EmptyQueueException;

public interface Queue<T> {
    void enqueue(T nodo);
    T dequeue() throws EmptyQueueException;

    boolean contains(T nodo);

    int size();

}
