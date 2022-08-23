package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Habilidades;
import com.Angularportfolio.portfolio.Repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HabilidadesService implements IHabilidadesService {

    @Autowired
    private HabilidadesRepository HabiRepository;
    
    @Override
    public List<Habilidades> getHabi(){
    List<Habilidades> listaHabilidades=HabiRepository.findAll();
    return listaHabilidades;
    }
    
    @Override
    public void saveHabi(Habilidades habi){
    HabiRepository.save(habi);
    }
    
    @Override
    public void deleteHabi(Long id){
    HabiRepository.deleteById(id);
    }
    
    @Override
    public Habilidades findHabi(Long id){
    Habilidades habi = HabiRepository.findById(id).orElse(null);
    return habi;
    }
    
}
