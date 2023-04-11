package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.FamiliarDao;
import com.basedatos.basededatos.models.FamiliarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FamiliarServices {

    @Autowired
    FamiliarDao familiarDao;

    public List<FamiliarModel> getAll(){
        return familiarDao.getFAll();
    }

    public FamiliarModel get( long id){

        return familiarDao.getF(id);
    }

    public FamiliarModel register( FamiliarModel familiarModel){
        return familiarDao.registerF(familiarModel);
    }

    public FamiliarModel update(@RequestBody FamiliarModel familiarModel){
        return familiarDao.updateF(familiarModel);
    }

    public void delete(@PathVariable long id){
        familiarDao.deleteF(id);
    }
}
