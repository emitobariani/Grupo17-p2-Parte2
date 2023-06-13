package uy.edu.um.prog2.adt.TADs.ArbolBinario;

public class ArbolBinarioBusquedaImpl implements ArbolBinarioBusqueda{

    Nodo raiz;

    public ArbolBinarioBusquedaImpl(){
        raiz = null;
    }

    @Override
    public void insertar(int valor) {

        raiz = insertarNodo(raiz, valor);

    }

    private Nodo insertarNodo(Nodo nodo, int valor){

        if(nodo == null){

            nodo = new Nodo(valor);
            return nodo;
        }

        if(valor < nodo.valor) {
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        }

        else if (valor > nodo.valor) {
            nodo.derecho = insertarNodo(nodo.derecho, valor);
        }

        return nodo;
    }



    @Override
    public boolean buscar(int valor){
        return buscarNodo(raiz, valor);
    }

    private boolean buscarNodo(Nodo nodo, int valor){

        if(nodo == null){
            return false;
        }

        if(valor == nodo.valor){
            return true;
        }

        if (valor < nodo.valor){
            return buscarNodo(nodo.izquierdo, valor);
        }

        return buscarNodo(nodo.derecho, valor);

    }

    @Override
    public void eliminar(int valor) {
        raiz = eliminarNodo(raiz, valor);


    }

    private Nodo eliminarNodo(Nodo raiz, int valor){

        if(raiz == null){
            return null;
        }

        if (valor< raiz.valor){
            raiz.izquierdo = eliminarNodo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = eliminarNodo(raiz.derecho, valor);
        }
        else {
            if (raiz.izquierdo == null){
                return raiz.derecho;
            } else if (raiz.derecho == null) {
                return raiz.izquierdo;
            }

            raiz.valor = minValor((raiz.derecho));
            raiz.derecho = eliminarNodo(raiz.derecho, raiz.valor);

        }

        return raiz;

    }

    private int minValor(Nodo nodo) {
        int minv = nodo.valor;
        while (nodo.izquierdo != null) {
            minv = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return minv;
    }


    @Override
    public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
    }

    private void imprimirEnOrdenRec(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrdenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirEnOrdenRec(nodo.derecho);
        }
    }
}
