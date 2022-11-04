/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_examen_problema_1;

/*
 * "
 * "
 */
package evaluacion2;

/**
 * @author Bryan Alexis Quintana Juarez
 */
public class Lista {

    private NodoLista inicio;
    private NodoLista fin;
    private int cont;

    //Por default, la lista está vacía
    public Lista() {
        this.inicio = null; //No hay nodos en la lista
        this.fin = null;
        cont = 0;
    }
    
    public boolean listaVacia(){
        if (inicio == null) {
            return true;
        }else{
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACÍA");
        } else {
            NodoLista temp = inicio;
            //¿Cómo muevo a temp?
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }

    //Agregar un nodo al final de la lista
    //Solución 1.- O👎
    public void agregar(String valor) {
        NodoLista nuevoNodo = new NodoLista(valor);

        //Verificar si hay nodo sen la lista
        if (inicio == null) { //No hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Hay nods en la lista
            //Hay que movernos por la lista Usando un nodo temporal hasta el último nodo de la lista
            /*Nodo temp = inicio;
            //¿Cómo muevo a temp?
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }

    public int tamaLista() {
//        int cont = 0;
//        Nodo temp = inicio;
//        //¿Cómo muevo a temp?
//        while (temp != null) {
//            cont++;
//            temp = temp.getSiguiente();
//        }
        return this.cont;
    }


    public void vaciarLista() {
        inicio = null;
        fin = null;
        this.cont  = 0;
    }
}
