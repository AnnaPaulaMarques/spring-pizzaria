package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.ItensPedido;
import soulcodeprojetospring.springpizzaria.service.ItensPedidoService;

import java.util.List;

@RestController
@RequestMapping("/itenspedidos")
public class ItensPedidoController {
    @Autowired
    private ItensPedidoService itensPedidoService;

    @PostMapping
    public ItensPedido adicionarItensPedido(@RequestBody ItensPedido itensPedidos) {
        return itensPedidoService.adicionarItensPedido(itensPedidos);

    }

    @GetMapping("/{id}")
    public String buscarItensPedidoId(@PathVariable Long id) {
        ItensPedido itensPedido = itensPedidoService.buscarItensPedidoId(id);
        if (itensPedido == null) {
            return "ItensPedido não encontado";
        }
        return itensPedido.toString();
    }

    @GetMapping("/todos")
    public List<ItensPedido> buscarItensPedido() {
        return itensPedidoService.buscarItensPedido();
    }

    @PostMapping("/atualizar")
    public ItensPedido atualizarItensPedido(@RequestBody ItensPedido itensPedido) {
        return itensPedidoService.atualizarItensPedido(itensPedido);
    }

    @DeleteMapping("/{id}")
    public String deletarItensPedido(@PathVariable Long id) {
        return itensPedidoService.deletarItensPedido(id);

    }
}
