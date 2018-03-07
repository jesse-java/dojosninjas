package com.naldojesse.dojos_ninjas.repositories;

import com.naldojesse.dojos_ninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja,Long>{
}
