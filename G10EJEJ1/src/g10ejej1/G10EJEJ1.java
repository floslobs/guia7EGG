/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class G10EJEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

        ArrayList<String> razaPerros = new ArrayList();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bucle = true;
        do {
            System.out.println("Ingresa una raza de perro");
            razaPerros.add(sc.next().toUpperCase());
            System.out.println("Desea agregar otro perro? S/N");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("N")) {
                bucle = false;
            }
        } while (bucle);
        for (String razaPerro : razaPerros) {
            System.out.println(razaPerro);
        }
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        System.out.println("Ingrese el nombre de la raza que desea eliminar");
        String razaEliminar = sc.next().toUpperCase();
        boolean noEncontrado = true;
        Iterator it = razaPerros.iterator();
        System.out.println("---------------------------------");
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();
                noEncontrado = false;
                break;
            }
        }
        Collections.sort(razaPerros);
        for (String razaPerro : razaPerros) {
            System.out.println(razaPerro);
        }
        if (noEncontrado) {
            System.out.println("NO se encontró la raza que desea eliminar");
        }

    }
}
    
    

