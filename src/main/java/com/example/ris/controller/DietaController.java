package com.example.ris.controller;

import com.example.ris.dao.DietaRepository;
import com.example.ris.models.Dieta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dieta")
public class DietaController {

    @Autowired
    private DietaRepository dietaDao;

    @GetMapping
    public Iterable<Dieta> returnDieta(){
        return dietaDao.findAll();
    }

    @PostMapping("/new")
    public Dieta addDieta(@RequestBody Dieta dieta){
        return dietaDao.save(dieta);
    }


}
