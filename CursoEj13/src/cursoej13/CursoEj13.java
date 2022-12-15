/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoej13;

import Curso.Servicios.CursoServicios;

/**
 *
 * @author Martin Norton
 */
public class CursoEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicios cs = new CursoServicios();
        cs.crearCurso();
        cs.calcularGananciaSemanal();
    }
    
}
