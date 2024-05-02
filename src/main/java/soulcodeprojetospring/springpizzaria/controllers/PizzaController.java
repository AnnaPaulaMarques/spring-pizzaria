package soulcodeprojetospring.springpizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Pizza;
import soulcodeprojetospring.springpizzaria.service.PizzaService;

import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public Pizza adicionarPizza(@RequestBody Pizza pizza) {
        return pizzaService.adicionarPizza(pizza);

    }

    @GetMapping("/{id}")
    public String buscarPizzaId(@PathVariable Long id) {
        Pizza pizza = pizzaService.buscarPizzaId(id);
        if (pizza == null) {
            return "Pizza não encontado";
        }
        return pizza.toString();
    }

    @GetMapping("/todos")
    public List<Pizza> buscarPizzas() {
        return pizzaService.buscarPizzas();
    }

    @PostMapping("/atualizar")
    public Pizza atualizarPizza(@RequestBody Pizza pizza) {
        return pizzaService.atualizarPizza(pizza);
    }

    @DeleteMapping("/{id}")
    public String deletarPizza(@PathVariable Long id) {
        return pizzaService.deletarPizza(id);

    }

}
