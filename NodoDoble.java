/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaen;

/**
 *
 * @author Rafael
 */
public class NodoDoble {

    public String dato;
    NodoDoble siguiente, anterior;
    //Constructor para cuando no hay nodos
    public NodoDoble(String dato) {
        this(dato, null, null);
        }

    //Constructor para cuando hay nodos
    public NodoDoble(String dato, NodoDoble s, NodoDoble a) {

        this.dato = dato;
        this.siguiente = s;
        this.anterior = a;
    }

    NodoDoble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
