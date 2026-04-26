package dev.java10x.CadastroDeClientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping  // Anotação para colocar todas as rotas no mesmo lugar
public class Controller {

    @GetMapping("/boasVindas") // pegar informações
    public String boasvindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }


}
