package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    
    public List <Experiencia> getExper();
    public void saveExper(Experiencia expe);
    public void deleteExper (Long id);
    public Experiencia findExper(Long id);
    
    
}
