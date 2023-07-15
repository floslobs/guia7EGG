/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejej5;

import SERVICIO.PaisServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class G10EJEJ5 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PaisServicio ps = new PaisServicio();
        HashSet<String> paises = ps.cargarPaises(sc);
        System.out.println("Ordenar y mostrar");
        System.out.println("------------------------");
        ps.ordernarYmostrar(paises);
        System.out.println("Eliminar pais");
        System.out.println("------------------------");
        ps.eliminarPais(paises, sc);
        System.out.println("Mostrar");
        System.out.println("------------------------");
        ps.ordernarYmostrar(paises);
    }
}
    
    

