package com.sena.frutimax.modelo;


import jakarta.persistence.*;

import java.util.Date;

@Entity


public class Facturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long facturaID;
    private Long pedidoID;
    private Double total;
    private Date fecha;
    private String historialDePedidos;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

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


