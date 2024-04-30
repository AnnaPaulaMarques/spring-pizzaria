package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.Bebida;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {
}
