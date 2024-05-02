package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Ingrediente;
import soulcodeprojetospring.springpizzaria.service.BebidaService;

import java.util.List;

@RestController
@RequestMapping("/bebidas")
public class BebidaController {

    @Autowired
    private BebidaService bebidaService;

    @PostMapping
    public Bebida adicionarBebida(@RequestBody Bebida bebida) {
        return bebidaService.adicionarBebida(bebida);

    }

    @GetMapping("/{id}")
    public String buscarBebidaId(@PathVariable Long id) {
        Bebida bebida = bebidaService.buscarBebidaId(id);
        if (bebida == null) {
            return "Bebida não encontado";
        }
        return bebida.toString();
    }

    @GetMapping("/todos")
    public List<Bebida> buscarBebidas() {
        return bebidaService.buscarBebidas();
    }

    @PostMapping("/atualizar")
    public Bebida atualizarBebida(@RequestBody Bebida bebida) {
        return bebidaService.atualizarBebida(bebida);
    }

    @DeleteMapping("/{id}")
    public String deletarBebida(@PathVariable Long id) {
        return bebidaService.deletarBebiba(id);

    }

}


