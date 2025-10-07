/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package happyfeet.Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author camper
 */
public class FacturaDuenos {
    private int documento_identidad;
    private String nombre_completo;
    private Date fechaEmision;
    private double total;
    private List<Factura>items;
    
    public FacturaDuenos(int documento, String nombre ,Date FechaEmision, double total, List<Factura>items){
        this.nombre_completo = nombre;
        this.documento_identidad = documento;
        this.fechaEmision = FechaEmision;
        this.total = total;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(int documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Factura> getItems() {
        return items;
    }

    public void setItems(List<Factura> items) {
        this.items = items;
    }
    
}
