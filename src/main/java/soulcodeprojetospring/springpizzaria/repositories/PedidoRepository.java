package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
