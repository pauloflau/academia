package com.jmp.academia.services;

import org.springframework.stereotype.Service;

import com.jmp.academia.dtos.AlunoDto;
import com.jmp.academia.entity.Aluno;
import com.jmp.academia.repositories.AlunoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AlunoService {
	private final AlunoRepository alunoRepository;
	
	public void insert(AlunoDto dto) {
		Aluno aluno = new Aluno();
		aluno.setMatricula(dto.getMatricula());
		//restante dos metodos
	}
	
	
}
