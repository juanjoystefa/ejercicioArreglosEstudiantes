/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import javax.swing.JOptionPane;
import Modelo.Usuario;
/**
 *
 * @author Usuario
 */
public class Agosto24 {

    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        String Codigo = JOptionPane.showInputDialog("Ingresa tu codigo");
        double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu definitiva de matemáticas: "));
        double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu definitiva de desarrollo: "));
        String aprobo = null;
        
        Usuario calculoDefinitiva = new Usuario(Nombre, Codigo, notaMatematica, notaDesarrollo);
        
        double definitiva = calculoDefinitiva.calcularDefinitiva();
        
        if(definitiva >= 3.5){
            aprobo = "Sí";
        }else{
            aprobo = "No";
        }
        
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nCodigo: "+ Codigo + "\nNota definitiva: " + definitiva + "\n¿Aprobó?: " + aprobo);
    }
}
