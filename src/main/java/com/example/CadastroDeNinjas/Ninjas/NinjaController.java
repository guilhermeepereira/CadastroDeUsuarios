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
    public NinjaDTO criar(@RequestBody NinjaDTO novoNinja){
        return ninjaService.criarNinja(novoNinja);
    }

    @GetMapping("/listar")
    public List<NinjaModel> listar(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    @PutMapping("/atualizar/{id}")
    public NinjaDTO atualizar(@PathVariable Long id, @RequestBody NinjaDTO novoNinja){
        return ninjaService.atualizarNinja(id, novoNinja);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
