package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface RegisterDao {

    List<RegisterModel> getRAll();
    RegisterModel getR( long id);
    RegisterModel registerR( RegisterModel registerModel);
    RegisterModel updateR( RegisterModel registerModel);
    void deleteR(  long id);

}
