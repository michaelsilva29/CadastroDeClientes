package dev.java10x.CadastroDeClientes.Clientes;

import dev.java10x.CadastroDeClientes.Pedidos.PedidosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma uma claase em uma entidade do banco e dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_de_clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String telefone;
    private String endereco;

    // Um cliente pode ter varios pedidos
    @OneToMany(mappedBy = "cliente")
    private List<PedidosModel> pedidos;

}
