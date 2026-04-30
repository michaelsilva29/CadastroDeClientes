package dev.java10x.CadastroDeClientes.Clientes;

import dev.java10x.CadastroDeClientes.Pedidos.PedidosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Cleanup;
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
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String email;

    @Column (name = "idade")
    private int idade;

    @Column (name = "telefone")
    private String telefone;

    @Column (name = "endereco")
    private String endereco;

    @Column (name = "img_url")
    private String imgUrl;

    // Um cliente pode ter varios pedidos
    @OneToMany(mappedBy = "cliente")
    private List<PedidosModel> pedidos;

}
