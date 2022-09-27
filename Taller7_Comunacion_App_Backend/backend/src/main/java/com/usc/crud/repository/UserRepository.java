package com.usc.crud.repository;

import com.usc.crud.model.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<Empleado, Long> {

    @Query("SELECT e FROM  Empleado e WHERE e.email =:email AND  e.password =:password ")
    List<Empleado> login(String email,  String password);
}
