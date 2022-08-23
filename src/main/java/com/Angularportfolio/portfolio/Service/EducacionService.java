package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Educacion;
import com.Angularportfolio.portfolio.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService {
    
    
    @Autowired
    private EducacionRepository EducRepository;
    
    @Override
    public List<Educacion> getEduc(){
    List<Educacion> listaEducacion=EducRepository.findAll();
    return listaEducacion;
    }
    
    @Override
    public void saveEduc(Educacion educ){
    EducRepository.save(educ);
    }
    
    @Override
    public void deleteEduc(Long id){
    EducRepository.deleteById(id);
    }
    
    @Override
    public Educacion findEduc(Long id){
    Educacion educ = EducRepository.findById(id).orElse(null);
    return educ;
    }
}
