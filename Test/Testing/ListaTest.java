package Testing;

import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Node;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {

    @org.junit.jupiter.api.Test
    void add() {
        Lista<Integer> l = new ListaEnlazada<>();
        l.add(1);
        assertEquals(1,l.get(0));

    }

    @org.junit.jupiter.api.Test
    void get() {
        Lista<Integer> l = new ListaEnlazada<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        assertEquals(3,l.get(2));
    }

    @org.junit.jupiter.api.Test
    void contains() {
        Lista<Integer> l = new ListaEnlazada<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        assertTrue(l.contains(4));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Lista<Integer> l = new ListaEnlazada<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.remove(2);
        assertFalse(l.contains(2));
    }

    @org.junit.jupiter.api.Test
    void size() {
        Lista<Integer> l = new ListaEnlazada<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        assertEquals(4,l.size());
    }
}