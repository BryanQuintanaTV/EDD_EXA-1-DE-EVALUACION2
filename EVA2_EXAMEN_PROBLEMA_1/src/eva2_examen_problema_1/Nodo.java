/*
 * "
 * "
 */
package eva2_examen_problema_1;

/**
 * @author Usuario
 */
public class Nodo {

    private String valor;
    private Nodo derecha;
    private Nodo izquierda;

    /*Por default, un nuevo nodo va al final de la lista
      El final de la lista se indica con null
      Por eso */
    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(String valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
