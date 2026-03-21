package com.jmp.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmp.academia.entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, String>{
}
