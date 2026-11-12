
package org.example.productoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @GetMapping("/productos")
    public String listarProductos() {
        return "Bienvenido al servicio de productos";
    }
}
