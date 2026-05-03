package dev.java10x.CadastroDeClientes.Pedidos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table(name = "tb_pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private Double valorTotal;
    private String status;
    private String descricao;

    // Um pedido só pode ter um cliente
    @ManyToOne
    @JoinColumn(name = "clientes_id") // Foreing Key ou chave estrangeira
    @JsonIgnore
    private ClienteModel cliente;


}
