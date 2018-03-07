package com.naldojesse.dojos_ninjas.services;

import com.naldojesse.dojos_ninjas.models.Dojo;
import com.naldojesse.dojos_ninjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private DojoRepository dojoRepository;
    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public List<Dojo> allDojos(){
        return dojoRepository.findAll();
    }

    public void addDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public Optional<Dojo> findDojoById(Long id) {
        return dojoRepository.findById(id);
    }
}
