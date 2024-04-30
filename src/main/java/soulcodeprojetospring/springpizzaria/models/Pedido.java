package soulcodeprojetospring.springpizzaria.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numPedido;

    private LocalDateTime dataHora;
    @OneToMany
    private List<Pizza> pizza;
    @OneToMany
    private List<Bebida> bebida;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Fornada fornada;


}
