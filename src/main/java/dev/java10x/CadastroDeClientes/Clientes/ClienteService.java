package dev.java10x.CadastroDeClientes.Clientes;


import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

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








}
