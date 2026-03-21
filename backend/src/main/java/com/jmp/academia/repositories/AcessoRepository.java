package com.jmp.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmp.academia.entity.Acesso;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Integer>{
}
