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
    private Long id;

    private String nome;
    private Float preço;
    private Boolean personalizada;

    @OneToOne
    private Tamanho tamanho;
    @OneToMany
    private List<Ingrediente> ingrediente;


}
