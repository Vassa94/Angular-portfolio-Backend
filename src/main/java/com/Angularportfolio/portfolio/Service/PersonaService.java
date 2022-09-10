package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Persona;
import com.Angularportfolio.portfolio.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository persoRepository;
    
    @Override
    public List<Persona> getPersonas(){
    List<Persona> listaPersonas=persoRepository.findAll();
    return listaPersonas;

    }

//    @Override
//    public Persona updatePersona (Long id, PersonaUpdate cuchuflito ){
//        Persona x = this.getPersona(id);
//        if (cuchuflito.getNombre()!=null){
//            x.setNombre(cuchuflito.getNombre());
//        }
//        return persoRepository.save(x);

//    }

    @Override
    public Persona getPersona(Long id){
        return (Persona) persoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savePersona(Persona perso){
    persoRepository.save(perso);
    }
    
    @Override
    public void deletePersona(Long id){
    persoRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id){
    Persona perso = persoRepository.findById(id).orElse(null);
    return perso;
    }
}
