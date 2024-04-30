package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.Tamanho;

public interface TamanhoRepository extends JpaRepository<Tamanho, Long> {
}
