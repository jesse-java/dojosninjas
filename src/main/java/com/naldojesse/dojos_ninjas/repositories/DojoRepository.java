package com.naldojesse.dojos_ninjas.repositories;

import com.naldojesse.dojos_ninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
}
