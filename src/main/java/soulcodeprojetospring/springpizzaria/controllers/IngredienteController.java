package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Ingrediente;
import soulcodeprojetospring.springpizzaria.service.IngredienteService;

import java.util.List;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {


    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping
    public Ingrediente adicionarIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.adicionarIngrediente(ingrediente);
    }

    @GetMapping("/{id}")
    public String buscarIngredienteId(@PathVariable Long id) {
        Ingrediente ingrediente = ingredienteService.buscarIngredienteId(id);
        if (ingrediente == null) {
            return "Ingrediente não encontado";
        }
        return ingrediente.toString();

    }
    @GetMapping("/todos")
    public List<Ingrediente> buscarIngredientes() {
        return ingredienteService.buscarIngredientes();
    }

    @PostMapping("/atualizar")
    public Ingrediente atualizarIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.atualizarIngrediente(ingrediente);
    }

    @DeleteMapping("/{id}")
    public String deletarIngrediente(@PathVariable Long id) {
        return ingredienteService.deletarIngrediente(id);

    }
}