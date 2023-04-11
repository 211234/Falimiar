package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.FamiliarDao;
import com.basedatos.basededatos.models.FamiliarModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Repository
@Transactional
public class FamiliarImp implements FamiliarDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<FamiliarModel> getFAll(){
        String hql = "FROM FamiliarModel as u";
        return (List<FamiliarModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public FamiliarModel getF( long id){
        return entityManager.find(FamiliarModel.class, id);
    }

    @Transactional
    @Override
    public FamiliarModel registerF( FamiliarModel familiarModel){
        entityManager.merge(familiarModel);
        return familiarModel;
    }

    @Transactional
    @Override
    public FamiliarModel updateF( FamiliarModel familiarModel){
        entityManager.merge(familiarModel);
        return familiarModel;
    }

    @Transactional
    @Override
    public void deleteF(  long id){
        FamiliarModel familiarModel = getF(id);
        entityManager.remove(familiarModel);
    }
}
