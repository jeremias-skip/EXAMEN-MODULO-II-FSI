/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author SAMYR
 */
public class CEDatos {
    int n;
    String empresa;
    int ruc;
    String direccion;
    String ubicacion;
    String fecha;
    String hora;
    String comprobante;
    String categoria;
    double importe;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public CEDatos() {
    }

    public CEDatos(int n, String empresa, int ruc, String direccion, String ubicacion, String fecha, String hora, String comprobante, String categoria, double importe) {
        this.n = n;
        this.empresa = empresa;
        this.ruc = ruc;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.hora = hora;
        this.comprobante = comprobante;
        this.categoria = categoria;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "CEDatos{" + "n=" + n + ", empresa=" + empresa + ", ruc=" + ruc + ", direccion=" + direccion + ", ubicacion=" + ubicacion + ", fecha=" + fecha + ", hora=" + hora + ", comprobante=" + comprobante + ", categoria=" + categoria + ", importe=" + importe + '}';
    }


     
}
