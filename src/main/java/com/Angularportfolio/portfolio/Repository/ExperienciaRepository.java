package com.Angularportfolio.portfolio.Repository;

import com.Angularportfolio.portfolio.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia,Long> {
    
}
