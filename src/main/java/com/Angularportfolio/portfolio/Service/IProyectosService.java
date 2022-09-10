/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Proyectos;
import java.util.List;


public interface IProyectosService {

    public List <Proyectos> getProyec();

    public void saveProyec(Proyectos proye);

    public void deleteProyec (Long id);
    
    public Proyectos findProyec(Long id);
}
