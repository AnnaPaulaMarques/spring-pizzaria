package soulcodeprojetospring.springpizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulcodeprojetospring.springpizzaria.models.Bebida;
import soulcodeprojetospring.springpizzaria.models.ItensPedido;
import soulcodeprojetospring.springpizzaria.models.Pedido;
import soulcodeprojetospring.springpizzaria.repositories.ItensPedidoRepository;
import soulcodeprojetospring.springpizzaria.repositories.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ItensPedidoService itensPedidoService;

    public Pedido adicionarPedido(Pedido pedido) {

        if(!pedido.getListaItens().isEmpty()){
            for(ItensPedido item : pedido.getListaItens() ){
                itensPedidoService.adicionarItensPedido(item);
            }
        }

        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedidoId(Long id) {
        return pedidoRepository.getById(id);
    }

    public List<Pedido> buscarPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido atualizarPedido(Pedido pedido){
        return  pedidoRepository.save(pedido);
    }

    public String deletarPedido(Long id){
        pedidoRepository.deleteById(id);;
        return "Pedido excluído com sucesso! " + id;
    }

}
