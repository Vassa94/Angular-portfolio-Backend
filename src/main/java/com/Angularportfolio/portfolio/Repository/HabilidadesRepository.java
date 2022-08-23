package com.Angularportfolio.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Angularportfolio.portfolio.Model.Habilidades;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades,Long> {
    
}
