/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class VendedorServicio {

    public Vendedor altaVendedor() {

        //instancia un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //llenar los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("ingrese el dia en el que empezo a trabajar");
        int dia = (leer.nextInt());
        System.out.println("ingrese el mes en el que empezo a trabajar");
        int mes = (leer.nextInt());
        System.out.println("ingrese el año en el que empezo a trabajar");
        int anio = (leer.nextInt());
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void SueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuales fueron las ventas totales del vendedor?");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("el sueldo mensual del vendedor: " + v1.getNombre() + "es de: " + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("le corresponden 14 dias de vacaciones");

        } else if (antiguedad < 10) {
            System.out.println("le corresponden 21 dias de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("le corresponden 28 dias de vacaciones");

        } else if (antiguedad > 20) {
            System.out.println("le corresponden 35 dias de vacaciones");

        } else {
            System.out.println("el empleado no tiene vacaciones");
        }
    }
}
