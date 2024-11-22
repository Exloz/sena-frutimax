package com.sena.frutimax.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Double precio;
    private String descripcion;
    private String categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*--------------------------*/


    @ManyToOne
    @JoinColumn(name = "inventario_ID")
    private Cliente inventario;

    public Cliente getInventario() {
        return inventario;
    }

    public void setInventario(Cliente inventario) {
        this.inventario = inventario;
    }

    /*--------------------------*/



    @OneToMany(mappedBy = "producto" , cascade = CascadeType.ALL)
    private List<Proveedor> proveedor;

    public List<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(List<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }

}
    /*--------------------------*/





