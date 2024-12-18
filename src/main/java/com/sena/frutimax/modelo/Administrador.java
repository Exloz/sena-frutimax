package com.sena.frutimax.modelo;

import jakarta.persistence.*;

@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String contacto;
    private String rolAdministrador;

    @OneToOne(mappedBy = "administrador")
    @JoinColumn
    private Inventario inventario;

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

    public String getRolAdministrador() {
        return rolAdministrador;
    }

    public void setRolAdministrador(String rolAdministrador) {
        this.rolAdministrador = rolAdministrador;
    }
}