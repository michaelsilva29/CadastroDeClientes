package dev.java10x.CadastroDeClientes.Clientes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping  // Anotação para colocar todas as rotas no mesmo lugar
public class ClienteController {

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
    @GetMapping("/todos")
    public String mostrarTodosClientes(){
        return "Mostrar todos os Clientes";
    }

    // Mostrar Clientes por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsClientesPorId(){
        return "Mostrar Clientes por ID";
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
