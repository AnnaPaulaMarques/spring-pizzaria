package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Pedido;
import soulcodeprojetospring.springpizzaria.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido adicionarPedido(@RequestBody Pedido pedido) {
        return pedidoService.adicionarPedido(pedido);

    }

    @GetMapping("/{id}")
    public String buscarPedidoId(@PathVariable Long id) {
        Pedido pedido = pedidoService.buscarPedidoId(id);
        if (pedido == null) {
            return "Pedido não encontado";
        }
        return pedido.toString();
    }

    @GetMapping("/todos")
    public List<Pedido> buscarPedidos() {
        return pedidoService.buscarPedidos();
    }

    @PostMapping("/atualizar")
    public Pedido atualizarPedido(@RequestBody Pedido pedido) {
        return pedidoService.atualizarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public String deletarPedido(@PathVariable Long id) {
        return pedidoService.deletarPedido(id);

    }





}
