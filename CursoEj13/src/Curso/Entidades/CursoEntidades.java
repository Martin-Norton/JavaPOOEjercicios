/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso.Entidades;

/**
 *
 * @author Martin Norton
 */
public class CursoEntidades {
    String nombreCurso , turno;
    int cantHorasxDia , cantDiasxSemana, precioxHora;
    String [] alumnos = new String[5];

    public CursoEntidades() {
    }

    public CursoEntidades(String nombreCurso, String turno, int cantHorasxDia, int cantDiasxSemana, int precioxHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantHorasxDia = cantHorasxDia;
        this.cantDiasxSemana = cantDiasxSemana;
        this.precioxHora = precioxHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantHorasxDia() {
        return cantHorasxDia;
    }

    public void setCantHorasxDia(int cantHorasxDia) {
        this.cantHorasxDia = cantHorasxDia;
    }

    public int getCantDiasxSemana() {
        return cantDiasxSemana;
    }

    public void setCantDiasxSemana(int cantDiasxSemana) {
        this.cantDiasxSemana = cantDiasxSemana;
    }

    public int getPrecioxHora() {
        return precioxHora;
    }

    public void setPrecioxHora(int precioxHora) {
        this.precioxHora = precioxHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
