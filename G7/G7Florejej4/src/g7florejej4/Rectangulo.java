/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7florejej4;

import java.util.Scanner;

/**
 *
 * @author ARG
 */
/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base 
y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los 
datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie
del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método
que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private double base;
    private double altura;

    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese base");
        this.base = (sc.nextDouble());
        System.out.println("ingrese altura ");
        this.altura = (sc.nextDouble());
    }

    public void superficie() {
        double superficie = base * altura;
        System.out.println("la superficie es " + superficie);
    }

    public void perimetro() {
        double perimetro = (base + altura) * 2;
        System.out.println("el perimetro es " + perimetro);

    }

    public void dibuRectangulo() {

        for (int j = 1; j <= base; j++) {
            System.out.print("*");
            System.out.println();

            for (int i = 1; i <= altura - 2; i++) {
                System.out.print("*");
                for (j = 1; j <= base - 2; j++) {
                    System.out.print(" ");

                }
                System.out.println("*");

            }
            for (j = 1; j <= base; j++) {
                System.out.print("*");
                System.out.println();

            }
        }

    }

}
