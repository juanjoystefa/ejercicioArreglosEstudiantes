/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author Usuario
 */
public class Usuario {
    private String id;
    private String nombre;
    private double notaDesarrollo;
    private double notaMatematica;
    private double definitiva;

    public Usuario(String id, String nombre, double notaDesarrollo, double notaMatematica) {
        
        this.id = id;
        this.nombre = nombre;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(Double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public Double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(Double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    
    public double calcularDefinitiva(){
        definitiva = notaDesarrollo*0.6 + notaMatematica*0.4;
        return definitiva;
    }
    
    public void incrementarNotaDesarrollo(double incremento){
        if (this.notaDesarrollo + incremento > 5.0){
            this.notaDesarrollo = 5.0;
        } else {
            this.notaDesarrollo = this.notaDesarrollo + incremento;
        }
    }
    
}
