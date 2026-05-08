package dev.java10x.CadastroDeClientes.Pedidos;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    private PedidosService pedidosService;

    public PedidosController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    // GET -- Mandar uma requisição para mostrar os pedidos
    @GetMapping("/listar")
    public List<PedidosModel> listarPedidos(){
        return pedidosService.listarPedidos();
    }

    // Mostrar pedido por ID
    @GetMapping("/listar/{id}")
    public PedidosModel listarPedidoPorId(@PathVariable Long id){
        return pedidosService.listarPedidosPorId(id);
    }

    // POST -- Mandar uma requisição para criar os pedidos
    @PostMapping("/criar")
    public PedidosModel criarPedido(@RequestBody PedidosModel pedidoModel){
        return pedidosService.criarPedido(pedidoModel);
    }

    // PUT -- Mandar uma requisição para alterar os pedidos
    @PutMapping("/alterar")
    public String alterarPedido(){
        return "Missão Alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar os pedidos por Id
    @DeleteMapping("/detelar/{id}")
    public void deletarPedidosPorId(@PathVariable Long id){
        pedidosService.deletarPedidoPorId(id);
    }





}
