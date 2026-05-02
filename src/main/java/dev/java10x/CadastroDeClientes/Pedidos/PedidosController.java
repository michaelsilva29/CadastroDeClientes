package dev.java10x.CadastroDeClientes.Pedidos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    // GET -- Mandar uma requisição para mostrar os pedidos
    @GetMapping("/listar")
    public String listarPedidos(){
        return "Pedidos listados com sucesso";
    }

    // POST -- Mandar uma requisição para criar os pedidos
    @PostMapping("/criar")
    public String criarPedido(){
        return "Pedido criado com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar os pedidos
    @PutMapping("/alterar")
    public String alterarPedido(){
        return "Missão Alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar os pedidos
    @DeleteMapping("/detelar")
    public String deletarPedido(){
        return "Pedido deletado com sucesso";
    }





}
