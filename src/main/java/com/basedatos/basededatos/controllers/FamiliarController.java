package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.FamiliarModel;
import com.basedatos.basededatos.services.FamiliarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/registro")
public class FamiliarController {
    @Autowired
    FamiliarServices familiarServices;

    @GetMapping("/getAll")
    List<FamiliarModel> getAllRegistro(){
        return familiarServices.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    FamiliarModel getRegistroById(@PathVariable("id") long id ){
        return familiarServices.get(id);
    }

    @PostMapping(value = "/create")
    FamiliarModel createRegistro(@RequestBody FamiliarModel familiarModel){
        return familiarServices.register(familiarModel);
    }

    @PutMapping(value = "/update/{id}")
    FamiliarModel updateRegistroById(@RequestBody FamiliarModel familiarModel ){
        return familiarServices.update(familiarModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteRegistroById(@PathVariable("id") long id){
        familiarServices.delete(id);
    }
}
