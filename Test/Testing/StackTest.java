package Testing;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.TADs.Exceptions.EmptyStackException;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.ListaEnlazada;
import uy.edu.um.prog2.adt.TADs.Queue.Queue;
import uy.edu.um.prog2.adt.TADs.Stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack<Integer> s = new ListaEnlazada<>();
        s.push(2);
        s.push(3);
        s.push(4);
        assertEquals(4,s.peek());
    }

    @Test
    void pop() throws EmptyStackException {
        Stack<Integer> s = new ListaEnlazada<>();
        s.push(2);
        s.push(3);
        s.push(4);
        assertEquals(4,s.pop());
    }

    @Test
    void peek() {
        Stack<Integer> s = new ListaEnlazada<>();
        s.push(2);
        s.push(3);
        assertEquals(3,s.peek());
    }

    @Test
    void size() {
        Stack<Integer> s = new ListaEnlazada<>();
        s.push(2);
        s.push(3);
        s.push(4);
        assertEquals(3,s.size());
    }
}