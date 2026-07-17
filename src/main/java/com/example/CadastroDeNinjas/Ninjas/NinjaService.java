package com.example.CadastroDeNinjas.Ninjas;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel novoNinja){
        NinjaModel ninjaCriado = ninjaRepository.save(novoNinja);
        return novoNinja;
    }

    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel novoNinja){
        if (ninjaRepository.existsById(id)){
            novoNinja.setId(id);
            return ninjaRepository.save(novoNinja);
        }
        return null;
    }
}