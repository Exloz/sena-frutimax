package com.sena.frutimax.repositorio;

import com.sena.frutimax.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Producto updateProductoById(Long id);
    Producto getProductoById(Long id);
}
