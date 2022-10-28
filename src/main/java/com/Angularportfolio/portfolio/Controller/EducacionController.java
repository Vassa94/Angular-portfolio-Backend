package com.Angularportfolio.portfolio.Controller;

import com.Angularportfolio.portfolio.Model.Educacion;
import com.Angularportfolio.portfolio.Service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.TRACE;

@CrossOrigin(origins = "http://localhost:4200", methods = {GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE})
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
    @RequestMapping(value = "/educacion/borrar/{id}", method = { RequestMethod.GET, RequestMethod.DELETE})
    public String deleteEduc(@PathVariable Long id){
         interEducacion.deleteEduc(id);
        // devuelve un string avisando si eliminó correctamente
        return "La informacion fue eliminada correctamente";
    }
     
    @PutMapping("educacion/editar/{id}")
    @RequestMapping(value = "/educacion/editar/{id}", method = { RequestMethod.GET, RequestMethod.PUT})
    public Educacion editEduc (@PathVariable Long id,    
                                @RequestParam("nombre")String nuevoNombre,
                                @RequestParam("fechaInicio")String nuevoFechaInicio,
                                @RequestParam("actual")Boolean nuevoActual,
                                @RequestParam("fechaFin")String nuevoFechaFin,
                                @RequestParam("descripcion")String nuevoDescripcion,
                                @RequestParam("titulo")String nuevotitulo,
                                @RequestParam("perId")Long nuevoPerId){
        
        Educacion educ=interEducacion.findEduc(id);
        
        educ.setNombre(nuevoNombre);
        educ.setFechaInicio(nuevoFechaInicio);
        educ.setActual(nuevoActual);
        if (nuevoActual){
            educ.setFechaFin("Actualmente");
        } else {
            educ.setFechaFin(nuevoFechaFin);
        }
        educ.setDescripcion(nuevoDescripcion);
        educ.setTitulo(nuevotitulo);
        educ.setPerId(nuevoPerId);
        
        interEducacion.saveEduc(educ);
        // retorna la nueva persona
        return educ;
        }


    
}
