package dev.java10x.CadastroDeClientes.Pedidos;

import dev.java10x.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
@Entity
@Table(name = "tb_pedidos")
public class PedidosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Data data;
    private Double valorTotal;
    private String status;
    private String descricao;

    // Um pedido só pode ter um cliente
    @ManyToOne
    @JoinColumn(name = "clientes_id") // Foreing Key ou chave estrangeira
    private ClienteModel cliente;


}
