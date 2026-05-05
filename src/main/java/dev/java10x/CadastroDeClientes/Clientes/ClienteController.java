package dev.java10x.CadastroDeClientes.Clientes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")  // Anotação para colocar todas as rotas no mesmo lugar
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/boasvindas") // pegar informações
    public String boasvindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // Add Cliente (CREATE)
    @PostMapping("/criar")
    public String criarCliente(){
        return "Cliente criado";
    }

    // Mostrar todos dos Clientes (READ)
    @GetMapping("/listar")
    public List<ClienteModel> listarClientes(){
        return clienteService.listarClientes();
    }

    // Mostrar Clientes por ID (READ)
    @GetMapping("/listar/{id}")
    public ClienteModel listarNinjasPorid(@PathVariable Long id){
        return clienteService.listarClientesPorId(id);
    }


    // Alterar dados dos Clientes (UPDATE)
    @PutMapping("/alterarID")
    public String alterarClientesPorId(){
        return "Alterar Cliente por ID";
    }

    // Deletar ClienteS (DETELE)
    @DeleteMapping("/detetarID")
    public String deletarClientesPorId(){
        return "Ninja deletado por ID";
    }


}
