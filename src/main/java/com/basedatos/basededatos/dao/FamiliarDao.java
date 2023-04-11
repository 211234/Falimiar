package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.FamiliarModel;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface FamiliarDao {

    List<FamiliarModel> getFAll();
    FamiliarModel getF( long id);
    FamiliarModel registerF( FamiliarModel familiarModel);
    FamiliarModel updateF( FamiliarModel familiarModel);
    void deleteF(  long id);

}
