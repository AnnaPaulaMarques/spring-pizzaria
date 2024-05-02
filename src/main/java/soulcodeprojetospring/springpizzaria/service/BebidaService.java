package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Ingrediente;
import soulcodeprojetospring.springpizzaria.repositories.BebidaRepository;

import java.util.Collections;
import java.util.List;

@Service
public class BebidaService {
    @Autowired
    private BebidaRepository bebidaRepository;

    public Bebida adicionarBebida(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    public Bebida buscarBebidaId(Long id) {
        return bebidaRepository.getById(id);
    }

    public List<Bebida> buscarBebidas(){
        return bebidaRepository.findAll();
    }

    public Bebida atualizarBebida(Bebida bebida){
        return  bebidaRepository.save(bebida);
    }

    public String deletarBebiba(Long id){
        bebidaRepository.deleteById(id);;
        return "Bebida excluída com sucesso! " + id;
    }

}

