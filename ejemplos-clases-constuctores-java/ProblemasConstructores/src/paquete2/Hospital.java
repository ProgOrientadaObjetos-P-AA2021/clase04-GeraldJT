/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;
    
    /*
        Crear un constructor que reciba como parámetros
        valores que serán asignados a los atributos.
    
    */
    public Hospital (String nom,String ciu, int nDoc, int nEn){
        nombre = nom;
        ciudad = ciu;
        numeroDoctores = nDoc;
        numeroEnfermeros = nEn;
    }
   /* public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%sNombre: %s\nCiudad: %s\nNumero de Doctores:"
                + "%d\nNumero de enfermeros: %d", cadenaF, nombre, ciudad,
                numeroDoctores, numeroEnfermeros);
        return cadenaF;

    }
 */   
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerNumeroEnfermeros(int n){
        numeroEnfermeros = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public int obtenerNumeroEnfermeros(){
        return numeroEnfermeros;
    }
    
}
