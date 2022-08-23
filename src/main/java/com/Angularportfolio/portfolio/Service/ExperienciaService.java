package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Experiencia;
import com.Angularportfolio.portfolio.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    private ExperienciaRepository ExpeRepository;
    
    @Override
    public List<Experiencia> getExper(){
    List<Experiencia> listaExperiencia=ExpeRepository.findAll();
    return listaExperiencia;
    }
    
    @Override
    public void saveExper(Experiencia expe){
    ExpeRepository.save(expe);
    }
    
    @Override
    public void deleteExper(Long id){
    ExpeRepository.deleteById(id);
    }
    
    @Override
    public Experiencia findExper(Long id){
    Experiencia expe = ExpeRepository.findById(id).orElse(null);
    return expe;
    }
    
    
}
