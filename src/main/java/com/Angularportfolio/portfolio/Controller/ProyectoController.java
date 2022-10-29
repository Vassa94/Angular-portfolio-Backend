package com.Angularportfolio.portfolio.Controller;

import com.Angularportfolio.portfolio.Model.Proyectos;
import com.Angularportfolio.portfolio.Service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.TRACE;


@CrossOrigin (origins = "*", methods = {GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE})
@RestController
public class ProyectoController {

    @Autowired
    private IProyectosService interProyectos;

    @GetMapping("/proyectos/traer")
    public List<Proyectos> getProye(){
        return interProyectos.getProyec();
    }

    @PostMapping("/proyectos/crear")
    public String createProye (@RequestBody Proyectos proye){

        interProyectos.saveProyec(proye);
        return "La informacion fue creada correctamente";
    }

    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProye(@PathVariable Long id){
        interProyectos.deleteProyec(id);
        return "La informacion fue eliminada correctamente";
    }

    @PutMapping("proyectos/editar/{id}")
    public Proyectos editProye (@PathVariable Long id,
                                 @RequestParam("descripcion")String nuevoDescripcion,
                                 @RequestParam("nombre")String nuevoNombre,
                                 @RequestParam("imgUrl")String nuevoUrl,
                                 @RequestParam("linkUrl")String nuevoLink,
                                 @RequestParam("perId")Long nuevoPerId){

        Proyectos proye=interProyectos.findProyec(id);

        proye.setDescripcion(nuevoDescripcion);
        proye.setNombre(nuevoNombre);
        proye.setImgUrl(nuevoUrl);
        proye.setLinkUrl(nuevoLink);
        proye.setPerId(nuevoPerId);

        interProyectos.saveProyec(proye);
        // retorna la nueva persona
        return proye;
    }

}
