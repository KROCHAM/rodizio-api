package com.pi.rodizioapi.controller;

import com.pi.rodizioapi.model.FuncionarioModel;
import com.pi.rodizioapi.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository  repository;

    //CRUD FUNCIONARIO
    @GetMapping(path = "api/funcionario")
    public Object getFuncionario(){
        return repository.findAll();
    }

    @GetMapping(path = "api/funcionario/{matricula}")
    public Object getFuncionarioMatricula(@PathVariable (value = "matricula") String matricula){
        return repository.findByMatricula(matricula);
    }

    @PostMapping(path = "api/funcionario")
    public String postFuncionario(@RequestBody FuncionarioModel funcionario){
        repository.save(funcionario);
        return "Funcionário Cadastrado com sucesso!";
    }

    @DeleteMapping(path = "api/funcionario/{matricula}")
    public String deleteFuncionarioMatricula(@PathVariable (value = "matricula") String matricula){
        FuncionarioModel funcionario = repository.findByMatricula(matricula);
        repository.delete(funcionario);
        return "Funcionario deletado com sucesso";
    }

    @PutMapping(path = "api/funcionario")
    public String putFuncionario(@RequestBody FuncionarioModel funcionario){
        repository.save(funcionario);
        return "Funcionario alterado com sucesso";
    }


}
