package com.Angularportfolio.portfolio.Service;

import com.Angularportfolio.portfolio.Model.Habilidades;
import java.util.List;



public interface IHabilidadesService {
    
    public List <Habilidades> getHabi();
    public void saveHabi(Habilidades habi);
    public void deleteHabi (Long id);
    public Habilidades findHabi(Long id);
}
