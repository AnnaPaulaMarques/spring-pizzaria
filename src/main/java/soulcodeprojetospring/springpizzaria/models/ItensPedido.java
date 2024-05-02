package soulcodeprojetospring.springpizzaria.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ItensPedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idPedido;

    @ManyToMany(mappedBy = "itensPedido", cascade = CascadeType.ALL)
    private List<Pizza> pizza;

    @ManyToMany(mappedBy = "itensPedido", cascade = CascadeType.ALL)
    private List<Bebida> bebida;

    private String observacao;

    @ManyToMany(mappedBy = "itensPedido", cascade = CascadeType.ALL)
    private List<Tamanho> tamanho;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "numPedido")

    private Pedido pedido;
}
