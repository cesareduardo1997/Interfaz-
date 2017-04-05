/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segundoparcial;

/**
 *
 * @author Cesar
 */
public class TaxiAlta {
    private String NumUnidad;
    private String placas;
    private Integer año;
    private String modelo;
    private Character chofer;
    private String cuenta;

    public TaxiAlta() {
    }

    public TaxiAlta(String NumUnidad, String placas, String cuenta) {
        this.NumUnidad = NumUnidad;
        this.placas = placas;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return  NumUnidad + " " + placas + " " + año + " " + modelo + " " + chofer + " " + cuenta;
    }

     
   

    public String getNumUnidad() {
        return NumUnidad;
    }

    public void setNumUnidad(String NumUnidad) {
        this.NumUnidad = NumUnidad;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Character getChofer() {
        return chofer;
    }

    public void setChofer(Character chofer) {
        this.chofer = chofer;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    

}
