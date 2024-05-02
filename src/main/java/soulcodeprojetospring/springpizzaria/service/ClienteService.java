package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.Cliente;
import soulcodeprojetospring.springpizzaria.repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente adicionarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarclienteId(Long id) {
        return clienteRepository.getById(id);
    }

    public List<Cliente> buscarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente atualizarCliente(Cliente cliente){
        return  clienteRepository.save(cliente);
    }

    public String deletarCliente(Long id){
        clienteRepository.deleteById(id);;
        return "Cliente excluído com sucesso! " + id;
    }

}
