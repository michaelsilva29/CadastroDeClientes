package dev.java10x.CadastroDeClientes.Pedidos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosService {

    private PedidosRepository pedidosRepository;

    public PedidosService(PedidosRepository pedidosRepository){
        this.pedidosRepository = pedidosRepository;
    }

    // Listar todos os pedidos
    public List<PedidosModel> listarPedidos(){
        return pedidosRepository.findAll();
    }

    // Listar todos os pedidos por ID
    public PedidosModel listarPedidosPorId(Long id){
        Optional<PedidosModel> pedidoPorId = pedidosRepository.findById(id);
        return pedidoPorId.orElse(null);
    }

    // Criar um novo Pedido
    public PedidosModel criarPedido(PedidosModel pedido) {
        return pedidosRepository.save(pedido);
    }

    // Excluir pedido por ID
    public void deletarPedidoPorId(Long id){
        pedidosRepository.deleteById(id);
    }
}
