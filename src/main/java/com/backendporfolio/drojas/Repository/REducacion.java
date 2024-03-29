package com.backendporfolio.drojas.Repository;

import com.backendporfolio.drojas.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findBynombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
    
}
