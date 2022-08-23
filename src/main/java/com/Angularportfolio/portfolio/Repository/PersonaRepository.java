
package com.Angularportfolio.portfolio.Repository;

import com.Angularportfolio.portfolio.Model.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona,Long>{
    
}
