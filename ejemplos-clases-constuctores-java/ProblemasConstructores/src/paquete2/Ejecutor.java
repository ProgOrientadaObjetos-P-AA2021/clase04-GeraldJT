/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre ;
        String ciudad ;
        int numeroDoctores;
        int numeroEnfermeros;
        System.out.println("Ingrese el nombre del Hospital");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad en el que se encuentra");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el número de doctores que dispone");
        numeroDoctores = entrada.nextInt();
        System.out.println("Ongrese el número de enfermeros de los que dispone");
        numeroEnfermeros = entrada.nextInt();
        Hospital h1 = new Hospital( nombre, ciudad, numeroDoctores, numeroEnfermeros);
            System.out.printf("Nombre: %s\nCiudad: %s\nNumero de Doctores:"
                + "%d\nNumero de enfermeros: %d\n", h1.obtenerNombre(),h1.obtenerCiudad()
                , h1.obtenerNumeroDoctores(),h1.obtenerNumeroEnfermeros());
            //System.out.printf("%s",h1);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        
    }
}
