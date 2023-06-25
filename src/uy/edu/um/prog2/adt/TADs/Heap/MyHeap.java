package uy.edu.um.prog2.adt.TADs.Heap;

public interface MyHeap<T extends Comparable<T>>  {


        T delete();


        T get();

        void insert(T element);

        int size();
}
