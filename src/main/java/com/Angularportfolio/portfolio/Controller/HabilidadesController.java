package com.Angularportfolio.portfolio.Controller;

import com.Angularportfolio.portfolio.Model.Habilidades;
import com.Angularportfolio.portfolio.Service.IHabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.TRACE;

@CrossOrigin(origins = "http://localhost:4200", methods = {GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE})
@RestController
public class HabilidadesController {
  
    @Autowired
    private IHabilidadesService interHabilidades;
    
    @GetMapping ("/habilidades/traer")
    public List<Habilidades> getHabi(){
        return interHabilidades.getHabi();
    }
    
    @PostMapping ("/habilidades/crear")
    public String createHabi (@RequestBody Habilidades habi){
        
        interHabilidades.saveHabi(habi);
        return "La informacion fue creada correctamente";
    }

    @DeleteMapping("/habilidades/borrar/{id}")
    public String deleteHabi(@PathVariable Long id){
         interHabilidades.deleteHabi(id);
        // devuelve un string avisando si eliminó correctamente
        return "La informacion fue eliminada correctamente";
    }
     
    @PutMapping("habilidades/editar/{id}")
    public Habilidades editHabi (@PathVariable Long id,    
                                @RequestParam("nivel")Long nuevoNivel,
                                @RequestParam("nombre")String nuevoNombre,
                                @RequestParam("perId")Long nuevoPerId){
        
        Habilidades habi=interHabilidades.findHabi(id);
        
        habi.setNivel(nuevoNivel);
        habi.setNombre(nuevoNombre);
        habi.setPerId(nuevoPerId);
        
        interHabilidades.saveHabi(habi);
        // retorna la nueva persona
        return habi;
        }


    
}
