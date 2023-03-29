package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Repository
@Transactional
public class RegisterImp implements RegisterDao{

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<RegisterModel> getRAll(){
        String hql = "FROM RegisterModel as u";
        return (List<RegisterModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public RegisterModel getR( long id){
        return entityManager.find(RegisterModel.class, id);
    }

    @Transactional
    @Override
    public RegisterModel registerR( RegisterModel registerModel){
        entityManager.merge(registerModel);
        return registerModel;
    }

    @Transactional
    @Override
    public RegisterModel updateR( RegisterModel registerModel){
        entityManager.merge(registerModel);
        return registerModel;
    }

    @Transactional
    @Override
    public void deleteR(  long id){
        RegisterModel registerModel = getR(id);
        entityManager.remove(registerModel);
    }
}
