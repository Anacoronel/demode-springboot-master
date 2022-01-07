package com.demo1.demo1.Repository;

import com.demo1.demo1.model.Ubicacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepository extends JpaRepository<Ubicacion, Long>{
    
}
