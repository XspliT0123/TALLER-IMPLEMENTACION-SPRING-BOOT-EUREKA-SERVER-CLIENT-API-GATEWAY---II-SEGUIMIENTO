
package org.example.pedidoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @GetMapping("/pedidos")
    public String listarPedidos() {
        return "Bienvenido al servicio de pedidos";
    }
}
