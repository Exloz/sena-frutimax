package com.sena.frutimax.controlador;

import com.sena.frutimax.modelo.Producto;
import com.sena.frutimax.servicio.DTOs.ProductoDTO;
import com.sena.frutimax.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAll(){
        var response = productoService.getAllProductos();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Producto> createProducto(@RequestBody ProductoDTO productoDTO){
        var response = productoService.createProducto(productoDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productoService.deleteProducto(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Producto> updateProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO){
        var response = productoService.updateProducto(id, productoDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

}
