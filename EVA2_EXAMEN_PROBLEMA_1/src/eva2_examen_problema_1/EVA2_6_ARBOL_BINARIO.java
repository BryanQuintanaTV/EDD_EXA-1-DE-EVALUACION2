/*
 * "PROGRAMA 1
 * "
 */
package eva2_examen_problema_1;

import java.util.Scanner;

/**
 *
 * @author Examen Evaluación 2
 */
public class EVA2_6_ARBOL_BINARIO {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        /*arbol.agregar("Rollins");
        arbol.agregar("Davidson");
        arbol.agregar("Brown");
        arbol.agregar("Ralson");
        arbol.agregar("Truman");
        arbol.agregar("Taft");
        arbol.agregar("Zuniga");*/
        Scanner leer = new Scanner(System.in);

        int continuar = 0;
        do {
            System.out.println("Introduzca la palabra");

            String name = leer.nextLine();
            arbol.agregar(name);

            System.out.println("Desea continuar agregando valores?\n            1=Si 0=No");
            continuar = leer.nextInt();

            leer.nextLine();
        } while (continuar == 1);

        //------------------------------------------------
        System.out.println("¿En que forma desea imprimir los valores?"
                + "\n1.- Pre order\n2.-In order\n3.-Post order\n4.-Exportar a lista e imprimir       ");

        int opcion = leer.nextInt();

        if (opcion == 1) {
            arbol.preOrder();
        } else if (opcion == 2) {
            arbol.inOrder();
        } else if (opcion == 3) {
            arbol.postOrder();
        } else if (opcion == 4) {
            arbol.exportar();
        } else {
            System.out.println("Solo se admiten números de 1 a 4");
        }

        //------------------------------------------------
        System.out.println("¿Desea eliminar un nodo?\n            1=Si 0=No");
        int cond = leer.nextInt();
        leer.nextLine();

        if (cond == 1) {

            System.out.println("¿Qué nodo desea eliminar?");
            String eliminar = leer.nextLine();
            arbol.eliminarNodo(eliminar);
        }

        //------------------------------------------------
        System.out.println("¿En que forma desea imprimir los valores?"
                + "\n1.- Pre order\n2.-In order\n3.-Post order\n4.-Exportar a lista e imprimir       ");

        opcion = leer.nextInt();

        if (opcion == 1) {
            arbol.preOrder();
        } else if (opcion == 2) {
            arbol.inOrder();
        } else if (opcion == 3) {
            arbol.postOrder();
        } else if (opcion == 4) {
            arbol.exportar();
        } else {
            System.out.println("Solo se admiten números de 1 a 4");
        }

        //------------------------------------------------
    }

}
