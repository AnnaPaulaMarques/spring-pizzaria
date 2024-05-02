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
public class Pizza {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idPizza;

    private String nome;
    private Float preco;
    private Boolean personalizada;


    @OneToMany
    private List<Ingrediente> listaIngredientes;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "item_pedido_pizza",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_pizza")
    )
    private List<ItensPedido> itensPedido;

}
