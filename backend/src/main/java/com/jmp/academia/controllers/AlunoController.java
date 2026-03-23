package com.jmp.academia.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jmp.academia.dtos.AlunoDto;
import com.jmp.academia.entity.Aluno;
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
	
	@GetMapping("/{matricula}")
	public ResponseEntity<AlunoDto> localizar(@PathVariable String matricula){		
		return ResponseEntity.ok(service.findById(matricula));
	}
	
	@PutMapping("/{matricula}")
	public ResponseEntity<AlunoDto> atualizar(@PathVariable String matricula, @RequestBody AlunoDto dto){		
		AlunoDto alunoDto = service.update(matricula, dto);
		return ResponseEntity.ok(alunoDto);
	}
	
	@DeleteMapping("/{matricula}")
	public ResponseEntity<Void> deletar(@PathVariable String matricula){		
		boolean deleted = service.delete(matricula);
		if (deleted) {
			return ResponseEntity.noContent().build(); // 204
		} else {
			return ResponseEntity.notFound().build(); // 404
		}
	}
}
