package uy.edu.um.prog2.adt.Algoritmos;

import uy.edu.um.prog2.adt.Entities.Driver;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Node;

public class Quicksort {
    public Lista<Driver> quickSort(Lista<Driver> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }

        Node<Driver> head = list.getFirst();
        Node<Driver> tail = list.getLast();

        quickSortHelper(head, tail);
        return list;
    }

    private void quickSortHelper(Node<Driver> head, Node<Driver> tail) {
        if (head == null || tail == null || head == tail || head.getPrevious() == tail) {
            return;
        }

        Node<Driver> pivotNode = partition(head, tail);

        quickSortHelper(head, pivotNode.getPrevious());
        quickSortHelper(pivotNode.getNext(), tail);
    }

    private  Node<Driver> partition(Node<Driver> head, Node<Driver> tail) {
        Node<Driver> pivot = tail;
        Node<Driver> i = head.getPrevious();

        for (Node<Driver> j = head; j != tail; j = j.getNext()) {
            if (j.getValue().getMenciones() < pivot.getValue().getMenciones()) {
                i = (i == null) ? head : i.getNext();
                swap(i, j);
            }
        }

        i = (i == null) ? head : i.getNext();
        swap(i, tail);

        return i;
    }

    private void swap(Node<Driver> node1, Node<Driver> node2) {
        Driver temp = node1.getValue();
        node1.setValue(node2.getValue());
        node2.setValue(temp);
    }
}

