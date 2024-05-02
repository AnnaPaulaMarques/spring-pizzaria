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

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItensPedido> listaItens;

    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "id")
    private Cliente cliente;

    @ManyToMany(mappedBy = "pedidos")
    private List<Fornada> fornada;


}
