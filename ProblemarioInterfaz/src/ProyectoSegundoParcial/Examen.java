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
public class Examen {

    private String pregunta;
    private String respuestaC;
    private String respuestaI1;
    private String respuestaI2;
    private String respuestaI3;
    private Integer Npregunta;
    public Examen() {
        this.pregunta=" ";
        this.respuestaC=" ";
        this.respuestaI1=" ";
        this.respuestaI2=" ";
        this.respuestaI3=" ";
        this.Npregunta=0;
    }

    @Override
    public String toString() {
        return pregunta+" "+respuestaC+" "+respuestaI1+ " "+respuestaI2+" "+respuestaI3+" "+Npregunta;
    }

    public Integer getNpregunta() {
        return Npregunta;
    }

    public void setNpregunta(Integer Npregunta) {
        this.Npregunta = Npregunta;
    }
     
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public void setRespuestaC(String respuestaC) {
        this.respuestaC = respuestaC;
    }

    public String getRespuestaI1() {
        return respuestaI1;
    }

    public void setRespuestaI1(String respuestaI1) {
        this.respuestaI1 = respuestaI1;
    }

    public String getRespuestaI2() {
        return respuestaI2;
    }

    public void setRespuestaI2(String respuestaI2) {
        this.respuestaI2 = respuestaI2;
    }

    public String getRespuestaI3() {
        return respuestaI3;
    }

    public void setRespuestaI3(String respuestaI3) {
        this.respuestaI3 = respuestaI3;
    }

   

}
