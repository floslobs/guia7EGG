/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICIO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class ProductoServicio {
 
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.



    public void introducirProducto(HashMap<String, Double> productos, Scanner sc) {
        boolean bucle = true;
        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = sc.next();
            System.out.println("Ingrese el precio del producto");
            double precio = sc.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea agregar otro elemento?");
            if (sc.next().equalsIgnoreCase("N")) {
                bucle = false;
            }
        } while (bucle);
    }

    public void modificarPrecio(HashMap<String, Double> productos, Scanner leer) {
        System.out.println("Ingrese el producto que desea modificar");
        String producto = leer.next();
        System.out.println("Ingrese el precio que desea modificar");
        double precioActual = leer.nextDouble();
//key
        productos.replace(producto, precioActual);
    }

    public void eliminarProducto(HashMap<String, Double> productos, Scanner leer) {
        System.out.println("Ingrese el producto que desea elimimar");
        String producto = leer.next();
        productos.remove(producto);
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.println("Producto: " + producto.getKey() + " precio: " + producto.getValue());
        }
    }
}
    

