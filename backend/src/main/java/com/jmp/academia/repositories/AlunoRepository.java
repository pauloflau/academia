package com.jmp.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jmp.academia.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String>{
	@Query("SELECT MAX(a.matricula) FROM Aluno a")
	String findMaxMatricula();
}
