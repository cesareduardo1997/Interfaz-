/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoSegundoParcial;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class ListadePreguntas {

    private ArrayList<Examen> ListadoPreguntas = new ArrayList<Examen>();

    public ListadePreguntas(ArrayList<Examen> ListadoPreguntas) {
        this.ListadoPreguntas = ListadoPreguntas;
    }

    public ListadePreguntas() {
    }

    /*@Override
    public String toString() {
        return "ListadePreguntas{" + "ListadoPreguntas=" + ListadoPreguntas + '}';
    }*/

    public ArrayList<Examen> getListadoPreguntas() {
        return ListadoPreguntas;
    }

    public void setListadoPreguntas(ArrayList<Examen> ListadoPreguntas) {
        this.ListadoPreguntas = ListadoPreguntas;
    }

    public void IncluirEPregunta(Examen E) {
        this.ListadoPreguntas.add(E);
    }

    public void imprimir() {
        if (ListadoPreguntas != null) {
            for (Examen opc : ListadoPreguntas) {
                System.out.println("---------------");
                System.out.println(opc.getPregunta());
                System.out.println(opc.getRespuestaC());
                System.out.println(opc.getRespuestaI1());
                System.out.println(opc.getRespuestaI2());
                System.out.println(opc.getRespuestaI3());
            }
        } else {
            System.out.println("No hay preguntas registradas");
        }
    }

}
