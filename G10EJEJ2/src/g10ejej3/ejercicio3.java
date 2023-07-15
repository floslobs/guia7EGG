/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ejej3;

import ENTIDAD.Alumno;
import SERVICIO.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author ARG
 */
public class ejercicio3 {
     public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        AlumnoServicio.crearListaAlumnos(alumnos);
        System.out.println("La nota final del alumno es: " + AlumnoServicio.notaFinal(alumnos));
        System.out.println("------------------------");

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        
     }
}
