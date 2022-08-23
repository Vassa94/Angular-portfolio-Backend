package com.Angularportfolio.portfolio.Controller;

import com.Angularportfolio.portfolio.Model.Experiencia;
import com.Angularportfolio.portfolio.Service.IExperienciaService;
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
public class ExperienciaController {

    @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping ("/experiencia/traer")
    public List<Experiencia> getExper(){
        return interExperiencia.getExper();
    }
    
    @PostMapping ("/experiencia/crear")
    public String createExper (@RequestBody Experiencia expe){
        
        interExperiencia.saveExper(expe);
        return "La informacion fue creada correctamente";
    }

    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExper(@PathVariable Long id){
         interExperiencia.deleteExper(id);
        // devuelve un string avisando si eliminó correctamente
        return "La informacion fue eliminada correctamente";
    }
     
    @PutMapping("experiencia/editar/{id}")
    public Experiencia editExper (@PathVariable Long id,    
                                @RequestParam("titulo")String nuevoTitulo,
                                @RequestParam("fechaInicio")String nuevoFechaInicio,
                                @RequestParam("actual")Boolean nuevoActual,
                                @RequestParam("fechaFin")String nuevoFechaFin,
                                @RequestParam("posicion")String nuevoPosicion,
                                @RequestParam("descripcion")String nuevoDescripcion,
                                @RequestParam("perId")Long nuevoPerId){
        
        Experiencia expe=interExperiencia.findExper(id);
        
        expe.setTitulo(nuevoTitulo);
        expe.setFechaInicio(nuevoFechaInicio);
        expe.setActual(nuevoActual);
        expe.setFechaFin(nuevoFechaFin);
        expe.setPosicion(nuevoPosicion);
        expe.setDescripcion(nuevoDescripcion);
        expe.setPerId(nuevoPerId);
        
        interExperiencia.saveExper(expe);
        // retorna la nueva persona
        return expe;
        }
    
}
