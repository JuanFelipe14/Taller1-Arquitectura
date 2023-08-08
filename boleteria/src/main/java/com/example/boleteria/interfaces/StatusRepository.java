package com.example.boleteria.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.boleteria.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    
}

