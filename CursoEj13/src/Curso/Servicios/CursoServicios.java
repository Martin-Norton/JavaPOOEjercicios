/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso.Servicios;

import Curso.Entidades.CursoEntidades;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class CursoServicios {
    Scanner leer = new Scanner(System.in);
    CursoEntidades ce = new CursoEntidades();
    public void cargarAlumnos(){
        System.out.println("ingrese el nombre de los alumnos que asisten a la clase ");
        for (int i = 0; i < ce.getAlumnos().length; i++) {
            System.out.println("ingrese el nombre del alumno "  + i);
            ce.getAlumnos()[i]=leer.next();
        }
    }
    public void crearCurso(){
        System.out.println("ingrese el nombre del curso");
        ce.setNombreCurso(leer.next());
        System.out.println("ingrese el turno");
        ce.setTurno(leer.next());
        System.out.println("ingrese la cantidad de horas por dia");
        ce.setCantHorasxDia(leer.nextInt());
        System.out.println("ingrese la cantidad de dias por semana");
        ce.setCantDiasxSemana(leer.nextInt());
        System.out.println("ingrese el precio por hora");
        ce.setPrecioxHora(leer.nextInt());
        cargarAlumnos();
    }
    public void calcularGananciaSemanal(){
        int gxhora = ce.getPrecioxHora() * ce.getAlumnos().length;
        int gxdia = ce.getCantHorasxDia() * gxhora;
        int gxsemana = ce.getCantDiasxSemana() * gxdia;
        System.out.println("la ganancia semanal es :" + gxsemana);
    }
    
}
