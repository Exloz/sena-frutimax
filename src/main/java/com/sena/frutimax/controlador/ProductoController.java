package com.sena.frutimax.controlador;

import com.sena.frutimax.modelo.Producto;
import com.sena.frutimax.servicio.DTOs.ProductoDTO;
import com.sena.frutimax.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/save")
    public ResponseEntity<Producto> createProducto(@RequestBody ProductoDTO productoDTO){
        var response = productoService.createProducto(productoDTO);
        return new ResponseEntity<Producto>(response, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<Producto> deleteProduct(@RequestBody ProductoDTO productoDTO){
        var response = productoService.createProducto(productoDTO);
        return new ResponseEntity<Producto>(response, HttpStatus.CREATED);
    }
}
