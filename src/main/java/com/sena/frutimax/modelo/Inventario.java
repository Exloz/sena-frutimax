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
    private List<Producto> productos;

    @OneToOne(mappedBy = "inventario")
    private Administrador administrador;

    public Double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Long getProductoID() {
        return productoID;
    }

    public void setProductoID(Long productoID) {
        this.productoID = productoID;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


}



