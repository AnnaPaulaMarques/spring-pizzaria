package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Fornada;
import soulcodeprojetospring.springpizzaria.service.FornadaService;

import java.util.List;

@RestController
@RequestMapping("/fornadas")
public class FornadaController {

    @Autowired
    private FornadaService fornadaService;

    @PostMapping
    public Fornada adicionarFornada(@RequestBody Fornada fornada) {
        return fornadaService.adicionarFornada(fornada);
    }

    @GetMapping("/{id}")
    public String buscarFornadaId(@PathVariable Long id) {
        Fornada fornada = fornadaService.buscarFornadaId(id);
        if (fornada == null) {
            return "Fornada não encontado";
        }
        return fornada.toString();
    }

    @GetMapping("/todos")
    public List<Fornada> fornada() {
        return fornadaService.buscarFornadas();
    }

    @PostMapping("/atualizar")
    public Fornada atualizarFornada(@RequestBody Fornada fornada) {
        return fornadaService.atualizarFornada(fornada);
    }

    @DeleteMapping("/{id}")
    public String deletarFornada(@PathVariable Long id) {
        return fornadaService.deletarFornada(id);

    }
}
