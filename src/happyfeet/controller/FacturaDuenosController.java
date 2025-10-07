/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package happyfeet.controller;

import happyfeet.Model.Factura;
import java.util.List;

/**
 *
 * @author camper
 */
public class FacturaDuenosController {
    public boolean generarFacturaDueno(String nombre, int documento, List<Factura>items){
        double total = items.stream().mapToDouble(Factura::getTotal).sum();
        return false;
    }
}
