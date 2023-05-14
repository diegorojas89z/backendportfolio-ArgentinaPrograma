package com.backendporfolio.drojas.Repository;

import com.backendporfolio.drojas.Entity.Cursos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCursos extends JpaRepository<Cursos, Integer>{
    public Optional<Cursos> findBynombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
