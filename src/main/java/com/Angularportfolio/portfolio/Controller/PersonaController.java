package com.Angularportfolio.portfolio.Controller;

import com.Angularportfolio.portfolio.Model.Persona;
import com.Angularportfolio.portfolio.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String createPersona (@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "la persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
         interPersona.deletePersona(id);
        // devuelve un string avisando si eliminó correctamente
        return "La persona fue eliminada correctamente";
    }
     
    @PutMapping("personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,    
                                @RequestParam("nombre")String nuevoNombre,
                                @RequestParam("apellido")String nuevoApellido,
                                @RequestParam("titulo")String nuevoTitulo,
                                @RequestParam("imgUrl")String nuevoImgUrl,
                                @RequestParam("about")String nuevoAbout){
        // busco la persona en cuestión
        Persona perso=interPersona.findPersona(id);
        // esto también puede ir en service
        // para desacoplar mejor aún el código en un nuevo método
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setTitulo(nuevoTitulo);
        perso.setImgUrl(nuevoImgUrl);
        perso.setAbout(nuevoAbout);
        
        interPersona.savePersona(perso);
        // retorna la nueva persona
        return perso;
        }
    
}

    
