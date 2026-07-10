package com.example.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Bem vindo a Ninjas";
    }

    @PostMapping("/criar")
    public String criar(){
        return "Ninja criado!";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listar(){
        return ninjaService.listarNinjas();
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
