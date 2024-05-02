package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Tamanho;
import soulcodeprojetospring.springpizzaria.repositories.TamanhoRepository;

import java.util.List;

@Service
public class TamanhoService {

    @Autowired
    private TamanhoRepository tamanhoRepository;

    public Tamanho adicionarTamanho(Tamanho tamanho) {
        return tamanhoRepository.save(tamanho);
    }

    public Tamanho buscarTamanhoId(Long id) {
        return tamanhoRepository.getById(id);
    }

    public List<Tamanho> buscarTamanhos(){
        return tamanhoRepository.findAll();
    }

    public Tamanho atualizarTamanho(Tamanho tamanho){
        return  tamanhoRepository.save(tamanho);
    }

    public String deletarTamanho(Long id){
        tamanhoRepository.deleteById(id);;
        return "Tamanho excluído com sucesso! " + id;
    }
}
