/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejej6;

import SERVICIO.ProductoServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class G10EJEJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> productos = new HashMap();

        ProductoServicio ps = new ProductoServicio();
        boolean bandera = true;
        do {
            System.out.println("1- Introducir productos");
            System.out.println("2- Modificar precio");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Mostrar productos");
            System.out.println("5- Salir");
            switch (sc.nextInt()) {
                case 1:
                    ps.introducirProducto(productos, sc);
                    break;
                case 2:
                    ps.modificarPrecio(productos, sc);
                    break;
                case 3:
                    ps.eliminarProducto(productos, sc);
                    break;
                case 4:
                    ps.mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("Desea continuar? S/N");
                    if (sc.next().equalsIgnoreCase("N")) {
                        bandera = false;
                    }
                    break;
                default:
                    System.out.println("NO se reconoce la opción ingresada");
            }
        } while (bandera);

    }
}

