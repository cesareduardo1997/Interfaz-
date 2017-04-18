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
public class Maestro {
   private String materia;
   private String tipoexamen;
   private String  carrera;
   private String Totalpreguntas;
   private String preguntasexamen;

    public Maestro() {
    }

    @Override
    public String toString() {
        return " "+materia+" "+ tipoexamen+" "+carrera+" "+Totalpreguntas+" "+ preguntasexamen ;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTipoexamen() {
        return tipoexamen;
    }

    public void setTipoexamen(String tipoexamen) {
        this.tipoexamen = tipoexamen;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTotalpreguntas() {
        return Totalpreguntas;
    }

    public void setTotalpreguntas(String Totalpreguntas) {
        this.Totalpreguntas = Totalpreguntas;
    }

    public String getPreguntasexamen() {
        return preguntasexamen;
    }

    public void setPreguntasexamen(String preguntasexamen) {
        this.preguntasexamen = preguntasexamen;
    }
   
   

   
    
}
