package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
