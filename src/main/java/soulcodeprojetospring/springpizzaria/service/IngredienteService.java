package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Ingrediente;
import soulcodeprojetospring.springpizzaria.repositories.IngredienteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredienteService {

    private final List<Ingrediente> listaDeIngredientes = new ArrayList<>();

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente adicionarIngrediente(Ingrediente ingrediente){
        return ingredienteRepository.save(ingrediente);
    }

    public Ingrediente buscarIngredienteId(Long id){
        return ingredienteRepository.getById(id);
    }

    public List<Ingrediente> buscarIngredientes(){
        return ingredienteRepository.findAll();
    }

    public Ingrediente atualizarIngrediente(Ingrediente ingrediente){
        return  ingredienteRepository.save(ingrediente);
    }

    public String deletarIngrediente(Long id){
        ingredienteRepository.deleteById(id);;
        return "Ingrediente excluída com sucesso! " + id;
    }

}

