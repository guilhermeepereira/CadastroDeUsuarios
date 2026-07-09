package com.example.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Bem vindo a Missões";
    }

    @PostMapping("/criar")
    public String criar(){
        return "Missão criada!";
    }

    @GetMapping("/listar")
    public String listar(){
        return "Missões listadas!";
    }

    @PutMapping("/atualizar")
    public String atualizar(){
        return "Missão atualizada!";
    }

    @DeleteMapping("/deletar")
    public String deletar(){
        return "Missão deletada!";
    }
}
