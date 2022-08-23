package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List <Educacion> getEduc();
    public void saveEduc(Educacion educ);
    public void deleteEduc (Long id);
    public Educacion findEduc(Long id);
}
