package com.sena.frutimax.modelo;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productoID;
    private Double cantidadDisponible;


    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    private List<Cajero> cajeros;

    public List<Cajero> getCajeros() {
        return cajeros;
    }

    public void setCajeros(List<Cajero> cajeros) {
        this.cajeros = cajeros;
    }

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



