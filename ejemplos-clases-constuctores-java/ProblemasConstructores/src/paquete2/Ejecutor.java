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
public class Ejecutor {
    public static void main(String[] args) {
        String nombre = "Isidro Ayora";
        String ciudad = "Loja";
        int numeroDoctores = 100;
        int numeroEnfermeros = 200;
        Hospital h1 = new Hospital( nombre, ciudad, numeroDoctores, numeroEnfermeros);
            System.out.printf("Nombre: %s\nCiudad: %s\nNumero de Doctores:"
                + "%d\nNumero de enfermeros: %d\n", h1.obtenerNombre(),h1.obtenerCiudad()
                , h1.obtenerNumeroDoctores(),h1.obtenerNumeroEnfermeros());
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        
    }
}
