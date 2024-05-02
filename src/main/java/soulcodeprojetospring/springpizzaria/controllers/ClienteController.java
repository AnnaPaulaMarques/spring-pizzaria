package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Cliente;
import soulcodeprojetospring.springpizzaria.service.BebidaService;
import soulcodeprojetospring.springpizzaria.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);

    }

    @GetMapping("/{id}")
    public String buscarClienteId(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarclienteId(id);
        if (cliente == null) {
            return "Cliente não encontado";
        }
        return cliente.toString();
    }

    @GetMapping("/todos")
    public List<Cliente> buscarClientes() {
        return clienteService.buscarClientes();
    }

    @PostMapping("/atualizar")
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {
        return clienteService.atualizarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public String deletarBebida(@PathVariable Long id) {
        return clienteService.deletarCliente(id);

    }
}
