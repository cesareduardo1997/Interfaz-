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
        if (ListadoPreguntas!= null) {
            for (Examen opc : ListadoPreguntas) {
               System.out.println(opc.toString()); 
            }
        } else {
            System.out.println("No hay preguntas registradas");
        }
    }
     public String getPosicionPre (int posicion,Examen e) {
         System.out.println("posicion: "+posicion);
        if (posicion >= 0 && posicion <  ListadoPreguntas .size() ) {
            e=new Examen();
            return  ListadoPreguntas .get(posicion)+" "+e;
              
               
        }
        return null;
     }
}
