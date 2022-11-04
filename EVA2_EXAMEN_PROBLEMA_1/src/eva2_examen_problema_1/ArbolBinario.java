/*
 * "
 * "
 */
package eva2_examen_problema_1;

/**
 *
 * @author Usuario
 */
public class ArbolBinario {

    Lista lista = new Lista();

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    //Método público para el usuario
    public void agregar(String valor) {
        //1 Que el nodo recibido es null
        //Árbol vacío
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecur(valor, root);
        }
    }

    //Método recursivo agregar
    //Necesita el valor y el nodo actual
    private void agregarRecur(String valor, Nodo nodoActual) {

        //2 Decidir si va a la izq. o der.
        /*
            Verificar si el lado (nodo) es null
                sí es null, ahí va el valor 
            si no
                Repetir recursión
         */
        Nodo nuevo = new Nodo(valor);
        int comparar = nodoActual.getValor().compareToIgnoreCase(valor);

        if (comparar > 0) { //Va a la izq

            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getIzquierda());
            }
        } else if (comparar < 0) { //Va a la der

            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getDerecha());
            }
        } else { //Igual
            System.out.println("¡ELEMENTO REPETIDO!");
        }
    }
    //Impresion de valores:
    //In-order
    //Izq valor der
    //Método público

    public void inOrder() {
        inOrderRecu(root);
        System.out.println("");
    }

    //Método privado recursivo
    private void inOrderRecu(Nodo nodo) {
        if (nodo != null) {
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecha());
        }
    }

    public void preOrder() {
        preOrderRecu(root);
        System.out.println("");
    }

    //Método privado recursivo
    private void preOrderRecu(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " - ");
            preOrderRecu(nodo.getIzquierda());
            preOrderRecu(nodo.getDerecha());
        }
    }

    public void postOrder() {
        postOrderRecu(root);
        System.out.println("");
    }

    //Método privado recursivo
    private void postOrderRecu(Nodo nodo) {
        if (nodo != null) {
            postOrderRecu(nodo.getIzquierda());
            postOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");
        }
    }

    public void exportar() {
        exportarPriv(lista, root);
        System.out.println("");
        lista.imprimir();
    }

    private void exportarPriv(Lista lista, Nodo nodo) {
        if (nodo != null) {
            exportarPriv(lista, nodo.getIzquierda());
            lista.agregar(nodo.getValor());
            exportarPriv(lista, nodo.getDerecha());
        }
    }

    public void eliminarNodo(String valor){
        removeValue(root, valor);
        System.out.println("");
    }
    
    private String minimum(Nodo root) {
        String minimum = root.getValor();
        while (root.getIzquierda() != null) {
            minimum = root.getIzquierda().getValor();
            root = root.getIzquierda();
        }
        return minimum;
    }

    private Nodo removeValue(Nodo root, String valor) {
        if (root == null) {
            return root;
        } else if (valor.compareTo(root.getValor()) < 0) {
            root.setIzquierda(removeValue(root.getIzquierda(), valor));
            //root.getIzquierda() = removeValue(root.getDerecha(), valor);
        } else if (valor.compareTo(root.getValor()) > 0) {
            root.setDerecha(removeValue(root.getDerecha(), valor));
            //root.right = removeValue(root.right, valor);
        } else {
            if (root.getIzquierda() == null) {
                return root.getDerecha();
            } else if (root.getDerecha() == null) {
                return root.getIzquierda();
            }

            //root.getValor() = minimum(root.getDerecha());
            root.setValor(minimum(root.getDerecha()));
            root.setDerecha(removeValue(root.getDerecha(), root.getValor()));
            //root.right = removeValue(root.right, root.value);
        }

        return root;
    }

}
