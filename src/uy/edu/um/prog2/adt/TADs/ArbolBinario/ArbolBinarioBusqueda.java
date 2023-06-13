package uy.edu.um.prog2.adt.TADs.ArbolBinario;

public interface ArbolBinarioBusqueda{

    void insertar(int valor);
    boolean buscar(int valor);
    void eliminar(int valor);
    void imprimirEnOrden();
}
