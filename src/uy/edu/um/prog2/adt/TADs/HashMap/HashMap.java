package uy.edu.um.prog2.adt.TADs.HashMap;

import java.util.HashSet;
import java.util.Set;

public class HashMap<K, Intger> {
    private int capacity = 10;
    private float loadFactor = 0.75F;
    private int size;
    private Nodo<K, Intger>[] table;

    public HashMap() {
        this.table = new Nodo[capacity];
    }

    private class Nodo<K, Integer> {
        K key;
        int value;
        Nodo<K, Integer> next;

        public Nodo(K key, Integer value) {
            this.key = key;
            this.value = (int) value;
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        Nodo<K, Intger>[] newTable = new Nodo[newCapacity];
        for (int i = 0; i < capacity; i++) {
            Nodo<K, Intger> nodo = table[i];
            while (nodo != null) {
                Nodo<K, Intger> next = nodo.next;
                int index = hash(nodo.key);
                nodo.next = newTable[index];
                newTable[index] = nodo;
                nodo = next;
            }
        }
        table = newTable;
        capacity = newCapacity;
    }

    public void add(K key, Intger value) {
        int index = hash(key);
        Nodo<K, Intger> nodo = table[index];
        while (nodo != null) {
            if (nodo.key.equals(key)) {
                nodo.value = (int) value;
                return;
            }
            nodo = nodo.next;
        }
        Nodo<K, Intger> nuevoNodo = new Nodo<>(key, value);
        nuevoNodo.next = table[index];
        table[index] = nuevoNodo;
        size++;
        if (size > capacity * loadFactor) {
            resize();
        }
    }

    public void remove(K key) {
        int index = hash(key);
        Nodo<K, Intger> nodo = table[index];
        Nodo<K, Intger> prev = null;
        while (nodo != null) {
            if (nodo.key.equals(key)) {
                if (prev == null) {
                    table[index] = nodo.next;
                } else {
                    prev.next = nodo.next;
                }
                size--;
                return;
            }
            prev = nodo;
            nodo = nodo.next;
        }

    }

    public Object get(K key) {
        int index = hash(key);
        Nodo<K, Intger> nodo = table[index];
        while (nodo != null) {
            if (nodo.key.equals(key)) {
                return nodo.value;
            }
            nodo = nodo.next;
        }
        return null;
    }

    public int getValue(K key) {
        int index = hash(key);
        Nodo<K, Intger> nodo = table[index];
        while (nodo != null) {
            if (nodo.key.equals(key)) {
                return nodo.value;
            }
            nodo = nodo.next;
        }
        return 0;
    }

    public int getSize() {
        return this.size;
    }

    public void plusOne(K key) {
        int index = hash(key);
        Nodo<K, Intger> nodo = table[index];
        while (nodo != null) {
            if (nodo.key.equals(key)) {
                nodo.value += 1; // Increment the value by 1 for the existing key
                return;
            }
            nodo = nodo.next;
        }
}
    public Set<K> getKeys() {
        Set<K> keys = new HashSet<>();
        for (Nodo<K, Intger> nodo : table) {
            while (nodo != null) {
                keys.add(nodo.key);
                nodo = nodo.next;
            }
        }
        return keys;
    }
}





