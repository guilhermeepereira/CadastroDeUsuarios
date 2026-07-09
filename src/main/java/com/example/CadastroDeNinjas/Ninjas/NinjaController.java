package com.example.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
public class NinjaController {
    @GetMapping("/welcome")
    public String welcome(){
        return "teste - welcome updated";
    }

    @PostMapping("/adicionar")
    public String add(){
        return "Adicionar Ninja";
    }

    @GetMapping("/listar")
    public String listar(){
        return "lista de ninjas";
    }

    @GetMapping("/listar_por_id")
    public String listarID(){
        return "Lista do ninja com ID";
    }

    @PutMapping("/atualizar")
    public String atualizar(){
        return "Atualizar infos do Ninja";
    }

    @DeleteMapping("/deletar")
    public String delete(){
        return "Deletar Ninja";
    }
}
