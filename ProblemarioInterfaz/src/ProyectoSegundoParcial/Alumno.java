/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoSegundoParcial;

/**
 *
 * @author Cesar
 */
public class Alumno {
    private String nombre;
    private String Matricula;
    private Character Tipoprueba;
    private String fecha;

    public Alumno() {
    }

    @Override
    public String toString() {
        return" "+nombre+" "+Matricula+" "+Tipoprueba+" "+fecha;
    }

    public Character getTipoprueba() {
        return Tipoprueba;
    }

    public void setTipoprueba(Character Tipoprueba) {
        this.Tipoprueba = Tipoprueba;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  

   

   
    
 }
