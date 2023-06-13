package Testing;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.TADs.ArbolBinario.Nodo;
import uy.edu.um.prog2.adt.TADs.Exceptions.EmptyQueueException;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;
import uy.edu.um.prog2.adt.TADs.Queue.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue<Integer> q = new ListaEnlazada<>();
        q.enqueue(9);
        q.enqueue(8);
        assertEquals(2,q.size());
    }

    @Test
    void dequeue() throws EmptyQueueException {
        Queue<Integer> q = new ListaEnlazada<>();
        q.enqueue(9);
        q.enqueue(8);
        assertEquals(9,q.dequeue());
    }

    @Test
    void contains() {
        Queue<Integer> q = new ListaEnlazada<>();
        q.enqueue(9);
        q.enqueue(8);
        assertTrue(q.contains(8));
    }

    @Test
    void size() {
        Queue<Integer> q = new ListaEnlazada<>();
        q.enqueue(9);
        q.enqueue(8);
        assertEquals(2,q.size());
    }
}