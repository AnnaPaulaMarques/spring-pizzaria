package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
