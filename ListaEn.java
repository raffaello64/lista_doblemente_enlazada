/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaen;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ListaEn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble L1 = new ListaDoble();
        int seleccionar = 0;
        String elemento;

        do {
            try {
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar elemento al inicio\n"
                        + "2. Agregar elemento al final\n"
                        + "3. Recorrer la lista de principio a fin\n"
                        + "4. Recorrer la lista de fin a principio\n"
                        + "5. Sacar elemento del inicio\n"
                        + "6. Sacar elemento del final\n"
                        + "7. Salir\n"
                        + "¿Que deseas hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (seleccionar) {
                    case 1:
                        elemento = JOptionPane.showInputDialog(null,
                                "Ingresa elemento al inicio de la lista", "Agregando nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE);
                        L1.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = JOptionPane.showInputDialog(null,
                                "Ingresa elemento al final de la lista", "Agregando nodo al final",
                                JOptionPane.INFORMATION_MESSAGE);
                        L1.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if (!L1.estVacia()) {
                            L1.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!L1.estVacia()) {
                            L1.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!L1.estVacia()) {
                            elemento = L1.sacarDeInicio();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es" + elemento,
                                    "Sacando el primer elemento", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!L1.estVacia()) {
                            elemento = L1.sacarDeFinal();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es" + elemento,
                                    "Sacando el último elemento", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada",
                                "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "El dato ingresado no se encuentra en el menú",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (seleccionar != 7);
    }

}
