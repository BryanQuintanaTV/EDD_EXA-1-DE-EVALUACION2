/*
 * "
 * "
 */
package eva2_examen_problema_1;

/**
 * @author Usuario
 */
public class NodoLista {

    private String valorLista;
    private NodoLista siguienteLista;
    
    /*Por default, un nuevo nodo va al final de la lista
      El final de la lista se indica con null
      Por eso */
    public NodoLista() {
        this.siguienteLista = null; 
    }

    public NodoLista(String valor) {
        this.valorLista = valor;
        this.siguienteLista = null;
    }

    public String getValor() {
        return valorLista;
    }

    public void setValor(String valor) {
        this.valorLista = valor;
    }

    public NodoLista getSiguiente() {
        return siguienteLista;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguienteLista = siguiente;
  }
}
