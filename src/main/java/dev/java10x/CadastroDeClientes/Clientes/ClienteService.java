package dev.java10x.CadastroDeClientes.Clientes;


import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    // Listar todos os meus clientes
    public List<ClienteModel> listarClientes() {
        return clienteRepository.findAll();
    }

    // Listar todos os Clientes por ID
    public ClienteModel listarClientesPorId(Long id){
        Optional<ClienteModel> clientePorId = clienteRepository.findById(id);
        return clientePorId.orElse(null);
    }

    //Criar um Novo Cliente
    public ClienteModel criarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    // Excluir o cliente por ID
    public void deletarCLientePorId(Long id){
        clienteRepository.deleteById(id);
    }

    // Atualizar Cliente
    public ClienteModel atualizarNinja(Long id, ClienteModel clienteModel){
        if (clienteRepository.existsById(id)){
            clienteModel.setId(id);
            return clienteRepository.save(clienteModel);
        }
        return null;
    }









}
