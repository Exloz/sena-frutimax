package com.sena.frutimax.modelo;

import jakarta.persistence.*;

@Entity
public class Cajero {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String contacto;
    private String rolCajero;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Cajero cajeros;

    public Cajero getCajeros() {
        return cajeros;
    }

    public void setCajeros(Cajero cajeros) {
        this.cajeros = cajeros;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getRolCajero() {
        return rolCajero;
    }

    public void setRolCajero(String rolCajero) {
        this.rolCajero = rolCajero;
    }
}