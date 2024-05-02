package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.Fornada;
import soulcodeprojetospring.springpizzaria.repositories.FornadaRepository;

import java.util.List;

@Service
public class FornadaService {


    @Autowired
    private FornadaRepository fornadaRepository;

    public Fornada adicionarFornada(Fornada fornada) {
        return fornadaRepository.save(fornada);
    }

    public Fornada buscarFornadaId(Long id) {
        return fornadaRepository.getById(id);
    }

    public List<Fornada> buscarFornadas(){
        return fornadaRepository.findAll();
    }

    public Fornada atualizarFornada(Fornada fornada){
        return  fornadaRepository.save(fornada);
    }

    public String deletarFornada(Long id){
        fornadaRepository.deleteById(id);;
        return "Fornada excluída com sucesso! " + id;
    }
}
