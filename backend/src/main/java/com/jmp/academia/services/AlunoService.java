package com.jmp.academia.services;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<AlunoDto> getAll() {
		
		List<Aluno> listaEntidade = alunoRepository.findAll();
		List<AlunoDto> listaDto = new ArrayList<>();
		
		for(Aluno aluno : listaEntidade) {
			AlunoDto dto = new AlunoDto(aluno);
			listaDto.add(dto);
		}
		
		return listaDto; 
	}
	
	@Transactional
	public AlunoDto insert(AlunoDto dto) {
		Aluno aluno = new Aluno(dto);
		
		aluno = alunoRepository.save(aluno);
		
		AlunoDto novoDto = new AlunoDto(aluno);
		
		return novoDto;
	}	
}
/*
 * 
	@Embedded //O ENDERECO FAZ PARTE DE ALUNO E COMPARTILHA O ID DE ALUNO
	private Endereco endereco = new Endereco();
	
	@Embedded //O TELEFONE FAZ PARTE DE ALUNO E COMPARTILHA O ID DE ALUNO
	private Telefone telefone = new Telefone();
 * */
 