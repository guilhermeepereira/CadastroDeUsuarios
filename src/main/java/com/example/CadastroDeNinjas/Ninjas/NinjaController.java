package com.example.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Bem vindo a Ninjas";
    }

    @PostMapping("/criar")
    public String criar(){
        return "Ninja criado!";
    }

    @GetMapping("/listar")
    public String listar(){
        return "Ninjas listados!";
    }

    @GetMapping("/listar_por_id")
    public String listarID(){
        return "Ninja por ID listado!";
    }

    @PutMapping("/atualizar")
    public String atualizar(){
        return "Ninja atualizado!";
    }

    @DeleteMapping("/deletar")
    public String deletar(){
        return "Ninja Deletado!";
    }
}
