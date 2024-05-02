package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.ItensPedido;
import soulcodeprojetospring.springpizzaria.repositories.ItensPedidoRepository;

import java.util.List;

@Service
public class ItensPedidoService {

    @Autowired
    private ItensPedidoRepository itensPedidoRepository;

    public ItensPedido adicionarItensPedido(ItensPedido itensPedido) {

        return itensPedidoRepository.save(itensPedido);
    }

    public ItensPedido buscarItensPedidoId(Long id) {
        return itensPedidoRepository.getById(id);
    }

    public List<ItensPedido> buscarItensPedido() {
        return itensPedidoRepository.findAll();
    }

    public ItensPedido atualizarItensPedido(ItensPedido itensPedido) {
        return itensPedidoRepository.save(itensPedido);
    }

    public String deletarItensPedido(Long id) {
        itensPedidoRepository.deleteById(id);

        return "ItensPedidos excluídos com sucesso! " + id;
    }
}
