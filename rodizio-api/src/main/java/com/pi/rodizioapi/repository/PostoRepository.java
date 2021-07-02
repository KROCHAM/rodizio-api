package com.pi.rodizioapi.repository;

import com.pi.rodizioapi.model.FuncionarioModel;
import com.pi.rodizioapi.model.PostoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface PostoRepository extends CrudRepository<PostoModel, Long> {
}