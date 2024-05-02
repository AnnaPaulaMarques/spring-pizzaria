package soulcodeprojetospring.springpizzaria.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tamanho {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idTamanho;

    private String nome;

    private Float desconto;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "item_pedido_bebida",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_tamanho")
    )
    private List<ItensPedido> itensPedido;

}
