package com.jmp.academia.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmp.academia.dtos.AlunoDto;
import com.jmp.academia.entity.Aluno;
import com.jmp.academia.repositories.AlunoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AlunoService {
	private final AlunoRepository alunoRepository;
	
	@Transactional
	public AlunoDto insert(AlunoDto dto) {
		Aluno aluno = new Aluno();
		aluno.setMatricula(dto.getMatricula());
		aluno.setSexo(dto.getSexo());
		aluno.setRg(dto.getRg());
		aluno.setDataNascimento(dto.getDataNascimento());
		aluno.setSituacao(dto.getSituacao());
		aluno.setEmail(dto.getEmail());
		
		aluno = alunoRepository.save(aluno);
		
		dto.setMatricula(aluno.getMatricula());
		dto.setSexo(aluno.getSexo());
		dto.setRg(aluno.getRg());
		dto.setDataNascimento(aluno.getDataNascimento());
		dto.setSituacao(aluno.getSituacao());
		dto.setEmail(aluno.getEmail());
		
		return dto;
	}	
}
/*
 * 
	@Embedded //O ENDERECO FAZ PARTE DE ALUNO E COMPARTILHA O ID DE ALUNO
	private Endereco endereco = new Endereco();
	
	@Embedded //O TELEFONE FAZ PARTE DE ALUNO E COMPARTILHA O ID DE ALUNO
	private Telefone telefone = new Telefone();
 * */
 