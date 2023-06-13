package uy.edu.um.prog2.adt.TADs.Stack;

import uy.edu.um.prog2.adt.TADs.Exceptions.EmptyStackException;

public interface Stack<T> {
    void push(T value);

    T pop() throws EmptyStackException;

    T peek();

    int size();
}
