/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author SAMYR
 */
public class CEIgv {
    
    double igv;
    
    double total;

    public CEIgv(double igv, double total) {
        this.igv = igv;
        this.total = total;
    }

    public CEIgv() {
    }
    

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
}
