package com.sena.frutimax.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persis

@Entity
public class Facturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long facturaID;
    private Long pedidoID;
    private Double total;
    private Date fecha;
    private String historialDePedidos;

    public java.lang.Long getFacturaID() {
        return facturaID;
    }

    public void setFacturaID(java.lang.Long facturaID) {
        this.facturaID = facturaID;
    }

    public java.lang.Long getPedidoID() {
        return pedidoID;
    }

    public void setPedidoID(java.lang.Long pedidoID) {
        this.pedidoID = pedidoID;
    }

    public java.lang.Double getTotal() {
        return total;
    }

    public void setTotal(java.lang.Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public java.lang.String getHistorialDePedidos() {
        return historialDePedidos;
    }

    public void setHistorialDePedidos(java.lang.String historialDePedidos) {
        this.historialDePedidos = historialDePedidos;
    }
}


