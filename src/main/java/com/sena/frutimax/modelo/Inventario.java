package com.sena.frutimax.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persis

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productoID;
    private Double cantidadDisponible;


    public java.lang.Double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(java.lang.Double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public java.lang.Long getProductoID() {
        return productoID;
    }

    public void setProductoID(java.lang.Long productoID) {
        this.productoID = productoID;
    }


}



