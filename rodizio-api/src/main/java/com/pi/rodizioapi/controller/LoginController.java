package com.pi.rodizioapi.controller;

import com.pi.rodizioapi.model.FuncionarioModel;
import com.pi.rodizioapi.model.LoginModel;
import com.pi.rodizioapi.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class LoginController {


    @Autowired
    private FuncionarioRepository repositoryFuncionario;

    @PostMapping(path = "api/login")
    public HashMap<String, Object> postFuncionario(@RequestBody LoginModel login){
        HashMap<String, Object> result = new HashMap<>();
        String matricula = login.getMatricula();
        String senha = login.getSenha();
        FuncionarioModel funcionarioModel = repositoryFuncionario.findByMatricula(matricula);
        String senhaf = funcionarioModel.getSenha();
        if(senha.equals(senhaf)){
            result.put("results",funcionarioModel);
        }else{
            result.put("results","Matricula e/ou senha incorretos");
        }
        return result;
    }

}
