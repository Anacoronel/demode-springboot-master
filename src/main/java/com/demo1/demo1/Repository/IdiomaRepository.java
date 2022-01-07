package com.demo1.demo1.Repository;
import com.demo1.demo1.model.Idioma;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Long>{
    
}
