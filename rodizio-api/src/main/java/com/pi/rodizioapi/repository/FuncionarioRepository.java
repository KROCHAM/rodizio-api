package com.pi.rodizioapi.repository;

import com.pi.rodizioapi.model.FuncionarioModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface FuncionarioRepository extends CrudRepository <FuncionarioModel, Long>{

    @Query(value = "SELECT * FROM funcionarios f WHERE f.matricula = :matricula", nativeQuery = true)
    FuncionarioModel findByMatricula(
            @Param("matricula") String matricula
    );

    @Query(value = "DELETE * FROM funcionarios f WHERE f.matricula = :matricula", nativeQuery = true)
    void deleteByMatricula(
            @Param("matricula") String matricula
    );
}
