package com.naldojesse.dojos_ninjas.services;

import com.naldojesse.dojos_ninjas.models.Dojo;
import com.naldojesse.dojos_ninjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DojoService {
    private DojoRepository dojoRepository;
    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public void addDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public Optional<Dojo> findDojoById(Long id) {
        return dojoRepository.findById(id);
    }
}
