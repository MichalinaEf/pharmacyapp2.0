package com.michalinaef.pharmacyapp.service;

import com.michalinaef.pharmacyapp.dto.MedicamentDTO;
import org.springframework.stereotype.Service;

@Service
public class MedicamentService {

    public void saveMedicament(MedicamentDTO medicamentDTO){
        String name = medicamentDTO.getName();
        String producer = medicamentDTO.getProducer();
        System.out.println("Medicament has been saved... ");
    }
}
