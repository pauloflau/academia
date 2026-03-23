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
	
	public AlunoDto findById(String matricula) {
		Aluno aluno = alunoRepository.findById(matricula).orElse(null);
		
		AlunoDto dto = new AlunoDto(aluno);
		
		return dto;
	}
	
	@Transactional
	public AlunoDto update(String matricula, AlunoDto dto) {
		Aluno aluno = alunoRepository.findById(matricula).orElse(null);
		
		if (aluno != null) {
			aluno = new Aluno(dto);
			aluno.setMatricula(matricula);
			
			aluno = alunoRepository.save(aluno);
			
			AlunoDto novoDto = new AlunoDto(aluno);
			
			return novoDto;
		}
		return null;		
	}
	
	@Transactional
	public boolean delete(String matricula) {
		Aluno aluno = alunoRepository.findById(matricula).orElse(null);
		
		if (aluno != null) {
			alunoRepository.deleteById(matricula);
			return true;
		}
		return false;
	}
}

 