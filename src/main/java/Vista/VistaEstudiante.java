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
        for (int i = 0; i < estudiantes.length; i++) {
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

        while (incremento < 0.0 || incremento > 0.5) {
            JOptionPane.showMessageDialog(null, "Error: La cifra debe estar entre 0.0 y 0.5");
            incremento = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cifra para incrementar la nota de desarrollo (entre 0.0 y 0.5"));
        }

        // Recorrer el arreglo para modificar la  nota de cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                estudiantes[i].incrementarNotaDesarrollo(incremento);
            }
        }

        double notaLimite = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota límite para el reporte (entre 0.0 y 4.9): "));

        while (notaLimite < 0.0 || notaLimite > 4.9) {
            JOptionPane.showMessageDialog(null, "Error: La nota límite debe estar entre 0.0 y 4.9");
            notaLimite = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota límite para el reporte (entre 0.0 y 4.9): "));
        }

        // Variable para armar el texto del reporte final
        String reporte = "Estudiantes con definitiva superior a " + notaLimite + ": \n\n";
        boolean hayEstudiantes = false; //Sirve para saber si al menos uno pasó el limite

        // Listar los objetos del arreglo
        for (int i = 0; i < estudiantes.length; i++) {
            // Se verifica que estudiantes[i] no sea null
            if (estudiantes[i] != null) {
                // Calculamos la definitiva actualizada
                double definitiva = estudiantes[i].calcularDefinitiva();

                // Si la definitiva supera la nota límite, lo agregamos al texto del reporte
                if (definitiva > notaLimite) {
                    reporte = reporte + "Código: " + estudiantes[i].getId() + "\n";
                    reporte = reporte + "Nombre: " + estudiantes[i].getNombre() + "\n";
                    reporte = reporte + "Nota Definitiva: " + definitiva + "\n";
                    reporte = reporte + "-----------------------------\n";
                    hayEstudiantes = true; // Confirmamos que encontramos al menos uno
                }
            }
        }

        // Si nadie superó la nota, mostramos un mensaje
        if (hayEstudiantes == false) {
            reporte = reporte + "Ningún estudiante superó la nota límite.";
        }

        // Mostrar el reporte final completo
        JOptionPane.showMessageDialog(null, reporte);
    }
}
