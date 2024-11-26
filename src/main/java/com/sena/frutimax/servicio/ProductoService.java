package com.sena.frutimax.servicio;

import com.sena.frutimax.modelo.Producto;
import com.sena.frutimax.repositorio.ProductoRepository;
import com.sena.frutimax.servicio.DTOs.ProductoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(ProductoDTO productoDTO){

        Producto producto = new Producto();
        var precioReal = productoDTO.getPrecio()*productoDTO.getCantidad();
        producto.setNombre(productoDTO.getNombre());
        producto.setCategoria(productoDTO.getCategoria());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setPrecio(precioReal);

        return productoRepository.save(producto);
    }

}
