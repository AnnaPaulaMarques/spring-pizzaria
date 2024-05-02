package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Tamanho;
import soulcodeprojetospring.springpizzaria.service.TamanhoService;

import java.util.List;

@RestController
@RequestMapping("/tamanho")
public class TamanhoController {

    @Autowired
    private TamanhoService tamanhoService;

    @PostMapping
    public Tamanho adicionarTamanho(@RequestBody Tamanho tamanho) {
        return tamanhoService.adicionarTamanho(tamanho);

    }

    @GetMapping("/{id}")
    public String buscarTamanhoId(@PathVariable Long id) {
        Tamanho tamanho = tamanhoService.buscarTamanhoId(id);
        if (tamanho == null) {
            return "Tamanho não encontado";
        }
        return tamanho.toString();
    }

    @GetMapping("/todos")
    public List<Tamanho> buscarTamanho() {
        return tamanhoService.buscarTamanhos();
    }

    @PostMapping("/atualizar")
    public Tamanho atualizarTamanho(@RequestBody Tamanho tamanho) {
        return tamanhoService.atualizarTamanho(tamanho);
    }

    @DeleteMapping("/{id}")
    public String deletarTamanho(@PathVariable Long id) {
        return tamanhoService.deletarTamanho(id);

    }
}
