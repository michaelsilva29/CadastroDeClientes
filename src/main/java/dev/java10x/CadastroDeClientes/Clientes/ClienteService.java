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

    // Listar todos os ninjas por ID
    public ClienteModel listarClientesPorId(Long id){
        Optional<ClienteModel> clienPorId = clienteRepository.findById(id);
        return clienPorId.orElse(null);
    }








}
