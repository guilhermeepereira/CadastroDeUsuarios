package com.example.CadastroDeNinjas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String welcome(){
        return "teste - welcome updated";
    }
}
