/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import javax.swing.JOptionPane;

import Modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class VistaEstudiante {

    public static void main(String[] args) {
        // Ingresar el número de estudiantes
        int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de estudiantes: "));

        // Se define el arreglo de tipo Usuario
        Estudiante[] estudiantes = new Estudiante[numEstudiantes];

        // Recorrido por el arreglo con un ciclo for para llenarlo
        for (int i = 0; i < estudiantes.length; i++){
            JOptionPane.showMessageDialog(null, "Ingresando datos del estudiante " + (i + 1));
            
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre: ");
            String codigo = JOptionPane.showInputDialog("Ingresa el código");
            double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la definitiva de matemáticas: "));
            double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la definitiva de desarrollo"));

            // Se crea el objeto y se asigna a la posición "i" del arreglo
            estudiantes[i] = new Estudiante(codigo, nombre, notaDesarrollo, notaMatematica);

        }
        
        // Validar que la cifra de incremento esté entre 0.0 y 0.5
        double incremento = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cifra para incrementar la nota de desarrollo (entre 0.0 y 0.5"));

        while (incremento < 0.0 || incremento > 0.5){
            JOptionPane.showMessageDialog(null, "Error: La cifra debe estar entre 0.0 y 0.5");
            incremento = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cifra para incrementar la nota de desarrollo (entre 0.0 y 0.5"));
        }

        // Recorrer el arreglo para modificar la  nota de cada estudiante
        for (int i = 0; i < estudiantes.length; i++){
            if (estudiantes[i] != null){
                estudiantes[i].incrementarNotaDesarrollo(incremento);
            }
        }

        JOptionPane.showMessageDialog(null, "¡Se registraron " + estudiantes.length + " estudiantes en el arreglo!");
    }
}
