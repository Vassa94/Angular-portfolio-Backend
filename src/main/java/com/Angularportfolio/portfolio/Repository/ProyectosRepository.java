package com.Angularportfolio.portfolio.Repository;

import com.Angularportfolio.portfolio.Model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos,Long> {
    
}
