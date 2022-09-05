/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaen;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Rafael
 */
public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    //Metodo para saber cuando la lista esta vacia
    public boolean estVacia() {
        return inicio == null;
    }

    //Metodo para agregar nodos al final
    public void agregarAlFinal(String D) {
        if (!estVacia()) {
            fin = new NodoDoble(D, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(D);
        }
    }

    //Metodo para agregar al inicio
    public void agregarAlInicio(String D) {
        if (!estVacia()) {
            inicio = new NodoDoble(D, fin, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(D);
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin() {
        if (!estVacia()) {
            String datos = "<";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "{" + auxiliar.dato + "}";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Recorriendo la lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Metodo para mostrar la lista de fin a inicio
    public void mostrarListaFinInicio() {
        if (!estVacia()) {
            String datos = ">";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "{" + auxiliar.dato + "}";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Recorriendo la lista de fin a inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Sacar elemento del inicio de la lista
    public String sacarDeInicio() {
    String elemento = inicio.dato;
    if(inicio == fin) {
    inicio = fin = null;
    }else {
    inicio = inicio.siguiente;
    inicio.anterior = null;
    }
    return elemento;
    }
    //Sacar elemento del final de la lista
    public String sacarDeFinal() {
    String elemento = fin.dato;
    if(inicio == fin) {
    inicio = fin = null;
    }else {
    fin = fin.anterior;
    fin.siguiente = null;
    }
    return elemento;
}
}
