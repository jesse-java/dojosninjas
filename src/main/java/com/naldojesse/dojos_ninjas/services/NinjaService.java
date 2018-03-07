package com.naldojesse.dojos_ninjas.services;

import com.naldojesse.dojos_ninjas.models.Ninja;
import com.naldojesse.dojos_ninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public void addNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }

}
