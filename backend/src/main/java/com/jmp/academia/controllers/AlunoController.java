package com.jmp.academia.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jmp.academia.dtos.AlunoDto;
import com.jmp.academia.services.AlunoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	private final AlunoService service;
	
	@PostMapping
	public ResponseEntity<AlunoDto> inserir(@RequestBody AlunoDto dto){
		dto = service.insert(dto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("{matricula}")
			.buildAndExpand(dto.getMatricula()).toUri();
		
		return ResponseEntity.created(uri).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<AlunoDto>> mostrarTodos(){
		return ResponseEntity.ok(service.getAll());
	}
	
}
