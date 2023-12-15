package com.michalinaef.pharmacyapp.controller;

import com.michalinaef.pharmacyapp.dto.MedicamentDTO;
import com.michalinaef.pharmacyapp.service.MedicamentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicaments")
public class MedicamentController {

    private MedicamentService medicamentService;

    public MedicamentController(MedicamentService medicamentService) {
        this.medicamentService = medicamentService;
    }

    @PostMapping("/add")
    public void addMedicament(@RequestBody MedicamentDTO medicamentDTO){
        System.out.println(medicamentDTO);
        medicamentService.saveMedicament(medicamentDTO);
    }
}
