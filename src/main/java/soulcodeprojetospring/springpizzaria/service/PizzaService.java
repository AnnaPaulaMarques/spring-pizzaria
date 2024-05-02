package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Pizza;
import soulcodeprojetospring.springpizzaria.repositories.PizzaRepository;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza adicionarPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Pizza buscarPizzaId(Long id) {
        return pizzaRepository.getById(id);
    }

    public List<Pizza> buscarPizzas(){
        return pizzaRepository.findAll();
    }

    public Pizza atualizarPizza(Pizza pizza){
        return  pizzaRepository.save(pizza);
    }

    public String deletarPizza(Long id){
        pizzaRepository.deleteById(id);;
        return "Pizza excluída com sucesso! " + id;
    }
}
