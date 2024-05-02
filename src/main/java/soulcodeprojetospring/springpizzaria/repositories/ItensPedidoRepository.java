package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.ItensPedido;

public interface ItensPedidoRepository extends JpaRepository<ItensPedido,Long> {
}
