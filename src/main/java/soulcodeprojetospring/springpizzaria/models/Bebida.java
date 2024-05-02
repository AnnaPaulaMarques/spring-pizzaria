package soulcodeprojetospring.springpizzaria.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Bebida {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idBebida;

    private Integer quantidade;

    private Float preço;

    private String descricao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "item_pedido_bebida",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_bebida")
    )
    private List<ItensPedido> itensPedido;
}
