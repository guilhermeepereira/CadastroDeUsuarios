package com.example.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {
    @GetMapping("/welcome")
    public String welcome(){
        return "teste - welcome updated";
    }
}
