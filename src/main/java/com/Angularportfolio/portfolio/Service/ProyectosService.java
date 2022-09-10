package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Proyectos;
import com.Angularportfolio.portfolio.Repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    private ProyectosRepository proyeRepository;

    @Override
    public List<Proyectos> getProyec(){
        List<Proyectos> listaProyectos=proyeRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyec(Proyectos proye){
        proyeRepository.save(proye);
    }

    @Override
    public void deleteProyec(Long id){
        proyeRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyec(Long id){

        Proyectos proye = proyeRepository.findById(id).orElse(null);
        return proye;
    }
}
