package com.pi.rodizioapi.controller;

import com.pi.rodizioapi.model.FuncionarioModel;
import com.pi.rodizioapi.model.PostoModel;
import com.pi.rodizioapi.repository.FuncionarioRepository;
import com.pi.rodizioapi.repository.PostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class PostoController {
    @Autowired
    private PostoRepository repository;

    @GetMapping(path = "api/posto")
    public Object getPosto(){
        return repository.findAll();
    }

    @GetMapping(path = "api/posto/{id}")
    public Object getPostoId(@PathVariable(value = "id") Long id){
        return repository.findById(id);
    }

    @PostMapping(path = "api/posto")
    public String postPosto(@RequestBody PostoModel posto){
        repository.save(posto);
        return "Posto Cadastrado com sucesso!";
    }

    @DeleteMapping(path = "api/posto/{id}")
    public String deletePostoId(@PathVariable (value = "id") Long id){
        repository.deleteById(id);
        return "Posto deletado com sucesso";
    }

    @PutMapping(path = "api/posto")
    public String putPosto(@RequestBody PostoModel posto){
        repository.save(posto);
        return "Posto alterado com sucesso";
    }
}
