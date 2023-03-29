package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class RegisterService {

    @Autowired
    RegisterDao registerDao;

    public List<RegisterModel> getAll(){
        return registerDao.getRAll();
    }

    public RegisterModel get( long id){

        return registerDao.getR(id);
    }

    public RegisterModel register( RegisterModel registerModel){
        return registerDao.registerR(registerModel);
    }

    public RegisterModel update(@RequestBody RegisterModel registerModel){
        return registerDao.updateR(registerModel);
    }

    public void delete(@PathVariable long id){
        registerDao.deleteR(id);
    }
}
