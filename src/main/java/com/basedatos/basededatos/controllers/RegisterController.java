package com.basedatos.basededatos.controllers;


import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping("/getAll")
    List<RegisterModel> getAllRegister(){
        return registerService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    RegisterModel getRegisterById(@PathVariable("id") long id ){
        return registerService.get(id);
    }

    @PostMapping(value = "/create")
    RegisterModel createRegister(@RequestBody RegisterModel registerModel){
        return registerService.register(registerModel);
    }

    @PutMapping(value = "/update/{id}")
    RegisterModel updateRegisterById(@RequestBody RegisterModel registerModel ){
        return registerService.update(registerModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteRegisterById(@PathVariable("id") long id){
        registerService.delete(id);
    }
}
