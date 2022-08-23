package com.Angularportfolio.portfolio.Controller;

import com.Angularportfolio.portfolio.Model.Educacion;
import com.Angularportfolio.portfolio.Service.IEducacionService;
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
public class EducacionController {
    
    
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping ("/educacion/traer")
    public List<Educacion> getEduc(){
        return interEducacion.getEduc();
    }
    
    @PostMapping ("/educacion/crear")
    public String createEduc (@RequestBody Educacion educ){
        
        interEducacion.saveEduc(educ);
        return "La informacion fue creada correctamente";
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEduc(@PathVariable Long id){
         interEducacion.deleteEduc(id);
        // devuelve un string avisando si eliminó correctamente
        return "La informacion fue eliminada correctamente";
    }
     
    @PutMapping("educacion/editar/{id}")
    public Educacion editEduc (@PathVariable Long id,    
                                @RequestParam("nombre")String nuevoNombre,
                                @RequestParam("fechaInicio")String nuevoFechaInicio,
                                @RequestParam("actual")Boolean nuevoActual,
                                @RequestParam("fechaFin")String nuevoFechaFin,
                                @RequestParam("descripcion")String nuevoDescripcion,
                                @RequestParam("perId")Long nuevoPerId){
        
        Educacion educ=interEducacion.findEduc(id);
        
        educ.setNombre(nuevoNombre);
        educ.setFechaInicio(nuevoFechaInicio);
        educ.setActual(nuevoActual);
        educ.setFechaFin(nuevoFechaFin);
        educ.setDescripcion(nuevoDescripcion);
        educ.setPerId(nuevoPerId);
        
        interEducacion.saveEduc(educ);
        // retorna la nueva persona
        return educ;
        }


    
}
