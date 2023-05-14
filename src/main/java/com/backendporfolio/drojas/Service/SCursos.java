package com.backendporfolio.drojas.Service;

import com.backendporfolio.drojas.Entity.Cursos;
import com.backendporfolio.drojas.Repository.RCursos;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCursos {
    @Autowired
    RCursos rCursos;
    
    public List<Cursos> list(){
        return rCursos.findAll();
    }
    
    public Optional<Cursos> getOne(int id){
        return rCursos.findById(id);
    }
    
    public Optional<Cursos> getByNombreE(String nombreE){
        return rCursos.findBynombreE(nombreE);
    }
   
    public void save(Cursos cursos){
        rCursos.save(cursos);
    }
    
    public void delete(int id){
        rCursos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rCursos.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rCursos.existsByNombreE(nombreE);
    }
    
}
