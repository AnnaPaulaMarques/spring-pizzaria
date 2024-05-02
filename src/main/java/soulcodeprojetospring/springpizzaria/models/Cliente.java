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
public class Cliente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    private String login;
    private String senha;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedido;

}
