package soulcodeprojetospring.springpizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soulcodeprojetospring.springpizzaria.models.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
