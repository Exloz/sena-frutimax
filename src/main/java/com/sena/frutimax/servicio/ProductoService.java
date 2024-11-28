package com.sena.frutimax.servicio;

import com.sena.frutimax.modelo.Producto;
import com.sena.frutimax.repositorio.ProductoRepository;
import com.sena.frutimax.servicio.DTOs.ProductoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    public Boolean deleteProductoRespuesta(Long id) {
        Producto producto = productoRepository.getProductoById(id);
        if (producto != null) {
            productoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Producto getProducto(Long id){
        return productoRepository.getProductoById(id);
    }

    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }

    public Producto updateProducto(Long id, ProductoDTO productoDTO){
        Producto producto = productoRepository.getProductoById(id);

        if (productoDTO.getPrecio() != null){
            producto.setPrecio(productoDTO.getPrecio());
        }
        if (productoDTO.getNombre() != null) producto.setNombre(productoDTO.getNombre());
        if (productoDTO.getCantidad() !=null) producto.setCategoria(productoDTO.getCategoria());
        if (productoDTO.getDescripcion() !=null) producto.setDescripcion(productoDTO.getDescripcion());

        return productoRepository.save(producto);
    }

}
