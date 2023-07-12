/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7florejej3;

import java.util.Scanner;

/**
 *
 * @author ARG
 */
/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación,
se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el 
método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se 
devuelve el resultado al main.
*/

public class Operacion {
    
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void creaOperacion(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese numero 1");
        this . num1 = ( sc . nextInt()) ;
        System.out.println("ingrese el numero 2");
        this .num2 = (sc.nextInt());
    }
    public void sumar(){
        int suma = num1 + num2;
        System.out.println("la suma de los numeros es " +suma);
    }
    public void resta(){
        int resta = num1 - num2;
        System.out.println("la resta de los numeros es " +resta);

    }

    public void multipli() {
        int multipli = num1 * num2;
        if (num1 == 0 || num2 == 0) {
            
            System.out.println(" la multiplicacion da error-----  " +multipli);

        } else {
            
            System.out.println("la multiplicacion es " + multipli);
        }
    }
    public void divid(){
       double divid = num1 / num2;
        if (num1 == 0 || num2 == 0) {
              
            System.out.println(" la divicion da error-----  " +divid);

        } else {
            
            System.out.println("la divicion es " + divid);
        }
       
    }

}
