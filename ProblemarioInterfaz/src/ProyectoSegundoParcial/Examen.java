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
    private Integer preguntasT;
    private String Apreguntas[][];

    public Examen() {
    }

    @Override
    public String toString() {
        return pregunta + " " + respuestaC + " " + respuestaI1 + " " + respuestaI2 + " " + respuestaI3;
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

    public Integer getPreguntasT() {
        return preguntasT;
    }

    public void setPreguntasT(Integer preguntasT) {
        this.preguntasT = preguntasT;
    }

    public void agregarpreguntas() {
        int col = 5;

        String[][] Apreguntas = new String[getPreguntasT()][col];

        for (int i = 0; i < Apreguntas.length; i++) {
            for (int j = 0; j < Apreguntas[0].length; j++) {
                if (col== 0) {
                    System.out.println(Apreguntas[i][j] = getPregunta());
                }
                else if (col== 1) {
                    System.out.println(Apreguntas[i][j] = getRespuestaC());
                }
                else if (col== 2) {
                    System.out.println(Apreguntas[i][j] = getRespuestaI1());
                }
                else if (col== 3) {
                    System.out.println(Apreguntas[i][j] = getRespuestaI2());
                }
                else if (col== 4) {
                    System.out.println(Apreguntas[i][j] = getRespuestaI3());
                }
            }
        }
    }
    
    public void imprimir(){
        int col=5;
         String[][] Apreguntas = new String[getPreguntasT()][col];
        for(int i = 0; i < Apreguntas.length; i++) {
	for(int j = 0; j < Apreguntas[0].length; j++) {
		System.out.print(Apreguntas[i][j]+" ");
	}
	System.out.println();
}
System.out.println();
    }

}
